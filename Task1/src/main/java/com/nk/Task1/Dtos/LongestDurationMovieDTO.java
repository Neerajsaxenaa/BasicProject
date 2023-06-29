package com.nk.Task1.Dtos;

public class LongestDurationMovieDTO {
	
	
	    private String tconst;
		
		private String primaryTitle;
		
		private Integer runtimeMinutes;
		
		private String genres;
		

		public LongestDurationMovieDTO() {
			super();
			// TODO Auto-generated constructor stub
		}
		

		public LongestDurationMovieDTO(String tconst, String primaryTitle, Integer runtimeMinutes, String genres) {
			super();
			this.tconst = tconst;
			this.primaryTitle = primaryTitle;
			this.runtimeMinutes = runtimeMinutes;
			this.genres = genres;
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

		public Integer getRuntimeMinutes() {
			return runtimeMinutes;
		}

		public void setRuntimeMinutes(Integer runtimeMinutes) {
			this.runtimeMinutes = runtimeMinutes;
		}

		public String getGenres() {
			return genres;
		}

		public void setGenres(String genres) {
			this.genres = genres;
		}
		
		

}
