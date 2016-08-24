package com.scientificin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.scientificin.entities.Sociedade;

public interface SociedadeRepository extends JpaRepository<Sociedade, Long>{
	
	@Query(nativeQuery=true, value="Select * From sociedade Where id = :parametro")
	public Sociedade findSocioById(@Param("parametro") Long id);
	
	@Query(nativeQuery=true, value="Select * From sociedade Where area Like %:area%")
	public List<Sociedade> findSocioByArea(@Param("area") String area);

}
