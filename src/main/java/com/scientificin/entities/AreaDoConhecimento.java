package com.scientificin.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "areas_do_conhecimento")
public class AreaDoConhecimento extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -9151652490705845827L;

	
	@Column(nullable=false, length=256) String nome;
	@ManyToOne(optional=false, cascade=CascadeType.PERSIST, fetch=FetchType.LAZY) GrandeAreaDoConhecimento grandeAreaDoConhecimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public GrandeAreaDoConhecimento getGrandeAreaDoConhecimento() {
		return grandeAreaDoConhecimento;
	}

	public void setGrandeAreaDoConhecimento(GrandeAreaDoConhecimento grandeAreaDoConhecimento) {
		this.grandeAreaDoConhecimento = grandeAreaDoConhecimento;
	}

}
