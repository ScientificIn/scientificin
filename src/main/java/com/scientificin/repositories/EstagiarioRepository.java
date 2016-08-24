package com.scientificin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.scientificin.entities.Estagiario;

public interface EstagiarioRepository  extends JpaRepository<Estagiario, Long>{
	
	@Query(nativeQuery=true, value="Select * From Estagiario Where id = :parametro")
	public Estagiario findEstagiarioById(@Param("parametro") Long id);
	
	@Query(nativeQuery=true, value="Select * From Estagiario Where AREA like '%:parametro%'")
	public List<Estagiario> findEstagiarioByArea(@Param("parametro") String area);

}
