package com.nk.Task1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nk.Task1.Dtos.TopRatedMovieDto;
import com.nk.Task1.service.Rating_Service;



@RestController
public class Rating_controller {
	
	@Autowired
	private Rating_Service rating_Service;
	
	@GetMapping("/top-rated-movies")
	public ResponseEntity<List<TopRatedMovieDto>> getTop10MoviesHandler(){
		List<TopRatedMovieDto> top10MoviesList = rating_Service.findTopRatedMovies(); //getting movies list
		return new ResponseEntity<List<TopRatedMovieDto>>(top10MoviesList,HttpStatus.OK); // returning
	}

}
