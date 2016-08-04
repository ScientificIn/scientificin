package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "grandes_areas_do_conhecimento")
public class GrandeAreaDoConhecimento extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -7301879173605311484L;
	
	@Column(nullable=false, unique=true) String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
