package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roll {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String rollname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRollname() {
		return rollname;
	}
	public void setRollname(String rollname) {
		this.rollname = rollname;
	}
	
	

}
