package com.scientificin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scientificin.entities.Conferencia;
import com.scientificin.entities.Sci;

public interface ConferenciasRepository extends JpaRepository<Conferencia, Long> {

	List<Conferencia> findBySci(Sci sci);
}
