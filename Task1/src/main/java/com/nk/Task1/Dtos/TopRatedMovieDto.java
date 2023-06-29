package com.nk.Task1.Dtos;

public class TopRatedMovieDto {

	private String tconst;

	private String primaryTitle;

	private String genre;

	private Double averageRating;

	public TopRatedMovieDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public TopRatedMovieDto(String tconst, String primaryTitle, String genre, Double averageRating) {
		super();
		this.tconst = tconst;
		this.primaryTitle = primaryTitle;
		this.genre = genre;
		this.averageRating = averageRating;
	}



	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public String getPrimaryTitle() {
		return primaryTitle;
	}

	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(Double averageRating) {
		this.averageRating = averageRating;
	}
	
	

}
