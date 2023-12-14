package com.agregio.model;

import java.util.List;

public class Offre extends TemporalBaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3578096517939042868L;
	
	private List<BlocHoraire> blocHoraires;
	private MarketType marketType;
	
	public List<BlocHoraire> getBlocHoraires() {
		return blocHoraires;
	}
	public void setBlocHoraires(final List<BlocHoraire> blocHoraires) {
		this.blocHoraires = blocHoraires;
	}
	public MarketType getMarketType() {
		return marketType;
	}
	public void setMarketType(final MarketType marketType) {
		this.marketType = marketType;
	}
}
