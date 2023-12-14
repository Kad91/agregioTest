package com.agregio.model;

import org.springframework.lang.NonNull;

import jakarta.persistence.Id;

public class Parc extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2346135489113742890L;

	@NonNull
	@Id
	private String name;
	
	@NonNull
	private ParcType type;
	
	public String getName() {
		return name;
	}
	
	public void setName(final String newName) {
		this.name = newName;
	}
	
	public ParcType getType() {
		return type;
	}
	
	public void setType(final ParcType newType) {
		this.type = newType;
	}
	
}
