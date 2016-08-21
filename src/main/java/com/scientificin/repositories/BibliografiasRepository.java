package com.scientificin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scientificin.entities.Bibliografia;
import com.scientificin.entities.Trabalho;

public interface BibliografiasRepository extends JpaRepository<Bibliografia, Long> {

	List<Bibliografia> findByTrabalho(Trabalho trabalho);
}
