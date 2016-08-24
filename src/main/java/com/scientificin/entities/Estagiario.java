package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Estagiario extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 3690557973414394778L;

	@Column(nullable = false, length = 256)
	public String empresa;

	@Column(nullable = false, length = 256)
	public String descricao;

	@Column(nullable = false, length = 256)
	public String area;

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
