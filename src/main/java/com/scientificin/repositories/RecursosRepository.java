package com.scientificin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scientificin.entities.Recurso;
import com.scientificin.entities.Trabalho;

public interface RecursosRepository extends JpaRepository<Recurso, Long> {

	List<Recurso> findByTrabalho(Trabalho trabalho);
}
