package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "instituicoes")
public class Instituicao extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 6613149730649239508L;
	
	@Column(nullable=false, unique=true, length=256) String nome;
	@Column(length=16) String sigla;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

}
