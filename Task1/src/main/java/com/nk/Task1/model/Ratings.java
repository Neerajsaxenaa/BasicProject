package com.nk.Task1.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Ratings {
	
	@Id
	private Integer id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Movies tconst;
	
	private Double averageRating;
	
	private Integer numVotes;

	public Ratings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ratings(Integer id, Movies tconst, Double averageRating, Integer numVotes) {
		super();
		this.id = id;
		this.tconst = tconst;
		this.averageRating = averageRating;
		this.numVotes = numVotes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Movies getTconst() {
		return tconst;
	}

	public void setTconst(Movies tconst) {
		this.tconst = tconst;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}

	public Integer getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(Integer numVotes) {
		this.numVotes = numVotes;
	}
	
	

}
