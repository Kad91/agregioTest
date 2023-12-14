package com.agregio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agregio.model.Parc;

public interface ParcRepository extends JpaRepository<Parc, Long>{

	public Parc findByName(final String name);
}
