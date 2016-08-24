package com.scientificin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scientificin.entities.Sci;
import com.scientificin.entities.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {

	List<Trabalho> findByAutor(Sci sci);}
