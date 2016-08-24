package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="orientador")
public class Orientador extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -7436880277945107140L;

	@Column(nullable = false, length = 256)
	public String orientador;

	@Column(nullable = false, length = 256)
	public String descricao;

	@Column(nullable = false, length = 256)
	public String area;

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
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
