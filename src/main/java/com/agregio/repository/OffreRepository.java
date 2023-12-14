package com.agregio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agregio.model.MarketType;
import com.agregio.model.Offre;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long>{

	public List<Offre> findByMarketType(final MarketType type);

}
