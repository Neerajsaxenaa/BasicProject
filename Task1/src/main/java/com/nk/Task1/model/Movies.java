package com.nk.Task1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
//@Table(name="Movie")
public class Movies {
	
	
	@Id
	private String TCONST           ;    
	private String TITTLE_TYPE      ;    
	private String PRIMARY_TITTLE   ;    
	private String RINTIME_MINUTES  ; 
	
	private String GENRES           ;  

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movies(String tCONST, String tITTLE_TYPE, String pRIMARY_TITTLE, String rINTIME_MINUTES, String gENRES) {
		super();
		TCONST = tCONST;
		TITTLE_TYPE = tITTLE_TYPE;
		PRIMARY_TITTLE = pRIMARY_TITTLE;
		RINTIME_MINUTES = rINTIME_MINUTES;
		GENRES = gENRES;
	}

	public String getTCONST() {
		return TCONST;
	}

	public void setTCONST(String tCONST) {
		TCONST = tCONST;
	}

	public String getTITTLE_TYPE() {
		return TITTLE_TYPE;
	}

	public void setTITTLE_TYPE(String tITTLE_TYPE) {
		TITTLE_TYPE = tITTLE_TYPE;
	}

	public String getPRIMARY_TITTLE() {
		return PRIMARY_TITTLE;
	}

	public void setPRIMARY_TITTLE(String pRIMARY_TITTLE) {
		PRIMARY_TITTLE = pRIMARY_TITTLE;
	}

	public String getRINTIME_MINUTES() {
		return RINTIME_MINUTES;
	}

	public void setRINTIME_MINUTES(String rINTIME_MINUTES) {
		RINTIME_MINUTES = rINTIME_MINUTES;
	}

	public String getGENRES() {
		return GENRES;
	}

	public void setGENRES(String gENRES) {
		GENRES = gENRES;
	}

	

}
