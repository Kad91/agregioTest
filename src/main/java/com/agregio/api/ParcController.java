package com.agregio.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agregio.model.Parc;
import com.agregio.model.ParcType;
import com.agregio.model.service.ParcSvc;

@RestController
@RequestMapping
public class ParcController {
	
	private ParcSvc parcSvc;

	@PostMapping
	public Parc createParc (final String name, final ParcType type){
		final Parc newParc = new Parc();
		newParc.setName(name);
		newParc.setType(type);
		return parcSvc.createParc(newParc);
	}
	
	@GetMapping
	public Parc getParc (final String name){
		return parcSvc.getParcByName(name);
	}
}
