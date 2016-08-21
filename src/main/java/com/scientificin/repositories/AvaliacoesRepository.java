package com.scientificin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scientificin.entities.Avaliacao;
import com.scientificin.entities.Trabalho;

public interface AvaliacoesRepository extends JpaRepository<Avaliacao, Long> {

	List<Avaliacao> findByTrabalho(Trabalho trabalho);
}
