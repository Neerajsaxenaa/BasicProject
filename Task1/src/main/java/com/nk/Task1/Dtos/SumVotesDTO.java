package com.nk.Task1.Dtos;

public class SumVotesDTO {
	
private String Genre;
	
	private String primaryTitle;

	private Integer numVotes;
	

	public SumVotesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public SumVotesDTO(String genre, String primaryTitle, Integer numVotes) {
		super();
		Genre = genre;
		this.primaryTitle = primaryTitle;
		this.numVotes = numVotes;
	}


	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getPrimaryTitle() {
		return primaryTitle;
	}

	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}

	public Integer getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(Integer numVotes) {
		this.numVotes = numVotes;
	}
	
	

}
