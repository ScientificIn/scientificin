package com.scientificin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scientificin.entities.options.AreaDoConhecimento;

public interface AreasDoConhecimentoRepository extends JpaRepository<AreaDoConhecimento, Long> {
}
