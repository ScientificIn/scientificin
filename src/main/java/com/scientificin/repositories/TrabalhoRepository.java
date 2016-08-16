package com.scientificin.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.scientificin.entities.Trabalho;
import com.scientificin.mappers.TrabalhoMapper;

public class TrabalhoRepository {

	@Autowired JdbcTemplate jdbc;
	
	public Trabalho findWorkDetails(Long projectId) {
		String procuraDetalhesDoTrabalho = "SELECT * FROM trabalhos t "
				+ "LEFT JOIN recursos r ON t.id = r.trabalho_id "
				+ "LEFT JOIN avaliacoes a ON t.id = a.trabalho_id "
				+ "LEFT JOIN bibliografias b ON t.id = b.trabalho_id "
				+ "WHERE t.id = ?";
		
		return jdbc.queryForObject(procuraDetalhesDoTrabalho, new Object[]{projectId}, new TrabalhoMapper());
	}

	
}
