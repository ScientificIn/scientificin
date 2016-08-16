package com.scientificin.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.scientificin.entities.Trabalho;

public class TrabalhoMapper implements RowMapper<Trabalho> {

	public Trabalho mapRow(ResultSet rs, int rowNum) throws SQLException {
		Trabalho trabalho = new Trabalho();
		
		trabalho.setNotasDoAutor(rs.getString("notasDoAutor"));
		
		return null;
	}

}
