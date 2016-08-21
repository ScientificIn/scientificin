package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="bibliografias")
public class Bibliografia extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -1284725197714967864L;

	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String detalhes;

	@ManyToOne
	private Trabalho trabalho;

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

	public Trabalho getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
	}

}
