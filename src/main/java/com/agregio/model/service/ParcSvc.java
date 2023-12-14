package com.agregio.model.service;

import org.springframework.stereotype.Service;

import com.agregio.model.Parc;
import com.agregio.repository.ParcRepository;

@Service
public class ParcSvc {
	
	private ParcRepository parcRepository;
	
	public Parc createParc(final Parc parc) {
		return parcRepository.save(parc);
	}
	
	public Parc getParcByName(final String name) {
		return parcRepository.findByName(name);
	}

}
