package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@DiscriminatorValue("2D_Movie")
@Table(name="2D_Movie")
public class Movie_2d extends Movie{
	private String casting;

	public String getCasting() {
		return casting;
	}

	public void setCasting(String casting) {
		this.casting = casting;
	}
	

}
