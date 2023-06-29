package com.nk.Task1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nk.Task1.Dtos.LongestDurationMovieDTO;
import com.nk.Task1.Dtos.SumVotesDTO;
import com.nk.Task1.model.Movies;

import jakarta.transaction.Transactional;

@Repository
public interface MoviesDao  extends JpaRepository<Movies, String>{

    @Query("select tconst,primary_tittle,runtime_Minutes,genres from Movies  order by runtime_minutes desc fetch first 10 rows only")
	List<LongestDurationMovieDTO> getLongestRuntimeMovies();
    
    
    @Modifying
	@Transactional
	@Query(value="Update Movies set runtime_Minutes = CASE WHEN genres = 'Documentary' THEN runtime_minutes+15 WHEN genres = 'Animation' THEN runtime_minutes+30 ELSE runtime_Minutes+45 END",nativeQuery = true)
	void updateRuntimeMinutes();


    @Query("select m.genres,m.primary_tittle,SUM(r.numVotes) from Movies m INNER JOIN Ratings r ON m.tconst = r.tconst group by m.primary_tittle,m.genres")
	 List<SumVotesDTO> findAllvotes();


   

}
