package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Bibliografia extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -1284725197714967864L;
	
	@Column(nullable = false)
	String nome;
	@Column(nullable = false)
	String detalhes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

}
