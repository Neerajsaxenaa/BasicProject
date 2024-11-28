package com.nk.Task1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nk.Task1.Dtos.LongestDurationMovieDTO;
import com.nk.Task1.Dtos.SumVotesDTO;
import com.nk.Task1.dao.MoviesDao;
import com.nk.Task1.model.Movies;
import com.nk.Task1.service.MoviesService;


@RestController
@RequestMapping("api/v1")
public class Movie_Controller{
	@Autowired
	private MoviesService moviesService;
	
	@Autowired
	private MoviesDao moviesDao;
	

	@PostMapping("/new-movie")
	public ResponseEntity<String> SaveMovies(@RequestBody Movies movies){
		String status = "";
		try {
			Movies saveMovies = moviesService.SaveMovies(movies);
			 status = "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return  new ResponseEntity<String>(status,HttpStatus.OK);
	}
	

	@GetMapping("/longest-duration-movies")
	public ResponseEntity<List<LongestDurationMovieDTO>> getTop10MoviesHandler(){
		List<LongestDurationMovieDTO> top10MoviesList = moviesService.maxDurationMovies(); //getting movies
		return new ResponseEntity<List<LongestDurationMovieDTO>>(top10MoviesList,HttpStatus.OK); //returning movies
	}
	
	@GetMapping("/update-runtime-minutes")
	public ResponseEntity<List<Movies>> updateRuntimeHandler(){
		moviesService.getUpdatedRuntimeMovies(); //updating
		List<Movies> movieList = moviesDao.findAll(); //getting the updated data
		
		return new ResponseEntity<List<Movies>>(movieList,HttpStatus.OK); //returning
	}
	
	@GetMapping("/genre-movies-with-subtotals")
	public ResponseEntity<List<SumVotesDTO>> getVotesHandler(){
		List<SumVotesDTO> top10MoviesList = moviesService.calculateVotes(); //getting movies
		return new ResponseEntity<List<SumVotesDTO>>(top10MoviesList,HttpStatus.OK); //returning movies
	}

}
