package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Orientador extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -7436880277945107140L;

	@Column(nullable = false, length = 256)
	public String orientado;

	@Column(nullable = false, length = 256)
	public String descricao;

	@Column(nullable = false, length = 256)
	public String area;

	public String getOrientado() {
		return orientado;
	}

	public void setOrientado(String orientado) {
		this.orientado = orientado;
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
