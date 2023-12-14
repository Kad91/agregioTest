package com.agregio.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agregio.model.MarketType;
import com.agregio.model.Offre;
import com.agregio.model.service.OffreSvc;

@RestController
@RequestMapping
public class OffreController {

	private OffreSvc offreSvc;

	@PostMapping
	public Offre createParc (final Offre newOffer) throws Exception{
		return offreSvc.createOffer(newOffer);
	}
	
	@GetMapping
	public List<Offre> getOffersByMarket(final MarketType type){
		return offreSvc.getOfferByMarketType(type);
	}
}
