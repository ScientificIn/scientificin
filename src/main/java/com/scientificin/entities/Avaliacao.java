package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="avaliacoes")
public class Avaliacao extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 4328345744516282091L;

	@Column(nullable = false, length = 5)
	private Integer nota;
	@Column(length = 256)
	private String comentario;

	@ManyToOne
	private Trabalho trabalho;

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Trabalho getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(Trabalho trabalho) {
		this.trabalho = trabalho;
	}

}
