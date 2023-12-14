package com.agregio.model;

import jakarta.persistence.ManyToOne;

public class BlocHoraire {
	
	private int nbHours;
	private long energyQuantity;
	/* Price in cents */
	private int minimumSellingPrice;
	
	
	/* Fournisseur d'electricité sur le bloc horaire*/
	@ManyToOne
	private Parc parc;
	
	public int getNbHours() {
		return nbHours;
	}
	public void setNbHours(int nbHours) {
		this.nbHours = nbHours;
	}
	public long getEnergyQuantity() {
		return energyQuantity;
	}
	public void setEnergyQuantity(long energyQuantity) {
		this.energyQuantity = energyQuantity;
	}
	public int getMinimumSellingPrice() {
		return minimumSellingPrice;
	}
	public void setMinimumSellingPrice(int minimumSellingPrice) {
		this.minimumSellingPrice = minimumSellingPrice;
	}

}
