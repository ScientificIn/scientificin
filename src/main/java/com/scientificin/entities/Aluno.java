package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="aluno")
public class Aluno extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 5432762686427691351L;

	@Column(nullable = false, length = 256)
	public String orientando;

	@Column(nullable = false, length = 256)
	public String universidade;

	@Column(nullable = false, length = 256)
	public String descricao;

	@Column(nullable = false, length = 256)
	public String area;

	public String getOrientando() {
		return orientando;
	}

	public void setOrientando(String orientando) {
		this.orientando = orientando;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
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
