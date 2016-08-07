package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Recurso extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 8007606952733454516L;
	
	@Column(nullable = false)
	String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	String link;
}
