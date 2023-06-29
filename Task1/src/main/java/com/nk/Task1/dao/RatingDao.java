package com.nk.Task1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nk.Task1.Dtos.TopRatedMovieDto;
import com.nk.Task1.model.Ratings;

public interface RatingDao  extends JpaRepository<Ratings, String>{

	    @Query("select m.tconst,m.primary_tittle,m.genres,r.average_rating from Movies m INNER JOIN Ratings r ON m.tconst = r.tconst where r.average_rating >= 6")
		List<TopRatedMovieDto> getTopRatedMovies();

}
