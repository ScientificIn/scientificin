package com.scientificin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.scientificin.entities.Estagio;
import com.scientificin.entities.Orientador;

public interface OrientadorRepository extends JpaRepository<Orientador, Long>{
	
	@Query(nativeQuery=true, value="Select * From Orientador Where id = :parametro")
	Orientador findOrById(@Param("parametro") Long id);
	
	@Query(nativeQuery=true, value="Select * From Orientador Where AREA like '%:parametro%'")
	public List<Orientador> findOrByArea(@Param("parametro") String area);	

}
