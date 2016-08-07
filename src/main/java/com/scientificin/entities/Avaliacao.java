package com.scientificin.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Avaliacao extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 4328345744516282091L;
	
	@Column(nullable = false, length = 5)
	Integer nota;
	@Column(length = 256)
	String comentario;

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

}
