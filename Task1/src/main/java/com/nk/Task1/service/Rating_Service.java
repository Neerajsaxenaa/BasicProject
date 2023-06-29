package com.nk.Task1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.Task1.Dtos.TopRatedMovieDto;
import com.nk.Task1.dao.RatingDao;

@Service
public class Rating_Service {

	@Autowired
	private RatingDao ratingDao;
	
	public List<TopRatedMovieDto> findTopRatedMovies() {
		// TODO Auto-generated method stub
		List<TopRatedMovieDto>topRatedMoviesList = ratingDao.getTopRatedMovies();
		return topRatedMoviesList;
	}

}
