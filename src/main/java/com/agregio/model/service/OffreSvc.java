package com.agregio.model.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agregio.model.BlocHoraire;
import com.agregio.model.MarketType;
import com.agregio.model.Offre;
import com.agregio.repository.OffreRepository;

/* Service utilisé pour créer de nouvelles offres */
@Service
public class OffreSvc {
	
	private static final int ONE_DAY_IN_HOUR = 24;
	
	private OffreRepository offreRepository;

	public Offre createOffer(final Offre offre) throws Exception {
		checkBlocks(offre);
		offreRepository.save(offre);
		return offre;
	}
	
	private static void checkBlocks(final Offre offre) throws Exception {
		int sumHours = 0;
		final List<BlocHoraire> blocs = offre.getBlocHoraires();
		for (final BlocHoraire bloc : blocs) {
			sumHours += bloc.getNbHours();
		}
		if (sumHours != ONE_DAY_IN_HOUR) {
			throw new Exception("Condition des blocs horaires pas respectée");
		}
	}

	public List<Offre> getOfferByMarketType(final MarketType type) {
		return offreRepository.findByMarketType(type);
	}
}
