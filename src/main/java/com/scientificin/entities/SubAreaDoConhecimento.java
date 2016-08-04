package com.scientificin.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "sub_areas_do_conhecimento")
public class SubAreaDoConhecimento extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 5757167168355056805L;
	
	@Column(nullable=false, length=256) String nome;
	@ManyToOne(optional=false, cascade=CascadeType.PERSIST, fetch=FetchType.LAZY) AreaDoConhecimento areaDoConhecimento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public AreaDoConhecimento getAreaDoConhecimento() {
		return areaDoConhecimento;
	}

	public void setAreaDoConhecimento(AreaDoConhecimento areaDoConhecimento) {
		this.areaDoConhecimento = areaDoConhecimento;
	}

}
