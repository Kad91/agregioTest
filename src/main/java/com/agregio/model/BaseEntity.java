package com.agregio.model;

import java.io.Serializable;


public class BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7451335721011945690L;
	
	private Long startDate;
	private Long dateLastmodification;
	
	public Long getStartDate() {
		return startDate;
	}
	public void setStartDate(Long startDate) {
		this.startDate = startDate;
	}
	public Long getDateLastmodification() {
		return dateLastmodification;
	}
	public void setDateLastmodification(Long dateLastmodification) {
		this.dateLastmodification = dateLastmodification;
	}
}
