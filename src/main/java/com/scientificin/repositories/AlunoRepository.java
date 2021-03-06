package com.scientificin.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.scientificin.entities.Aluno;


public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	@Query(nativeQuery=true, value="Select * From aluno Where id = :parametro")
	public Aluno findAlunoById(@Param("parametro") Long id);
	
	@Query(nativeQuery=true, value="Select * From aluno Where area Like %:area%")
	public List<Aluno> findAlunoByArea(@Param("area") String area);

}
