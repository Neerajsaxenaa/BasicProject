package com.nk.Task1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.Task1.Dtos.LongestDurationMovieDTO;
import com.nk.Task1.Dtos.SumVotesDTO;
import com.nk.Task1.dao.MoviesDao;
import com.nk.Task1.model.Movies;



@Service
public class MoviesService {
	
	@Autowired
	private MoviesDao moviesDao;

	public List<Movies> getAllMovies() {
		// TODO Auto-generated method stub
		return moviesDao.findAll();
	}

	
	public Movies SaveMovies(Movies movies) {
		return  moviesDao.save(movies);

	}

	public Movies getMovieById(String tconst) {
		// TODO Auto-generated method stub
		return moviesDao.findById(tconst).get();
	}


	public List<LongestDurationMovieDTO> maxDurationMovies() {
		// TODO Auto-generated method stub
		List<LongestDurationMovieDTO> movieDTOList = moviesDao.getLongestRuntimeMovies();
		return movieDTOList;
	}


	public void getUpdatedRuntimeMovies() {
		moviesDao.updateRuntimeMinutes();

	}


	public List<SumVotesDTO> calculateVotes() {
		List<SumVotesDTO> votes = moviesDao.findAllvotes();
		return votes;
	}

	
	
	

}
