package com.scientificin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.scientificin.entities.Estagio;

public interface  EstagioRepository  extends JpaRepository<Estagio, Long>{
	
	@Query(nativeQuery=true, value="Select * From Estagio Where id = :parametro")
	public Estagio findEstById(@Param("parametro") Long id);
	
	@Query(nativeQuery=true, value="Select * From Estagio Where AREA Like %:area%")
	public List<Estagio> findEstByArea(@Param("area") String area);
	
	
	
}
