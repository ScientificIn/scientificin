package com.scientificin.entities.options;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name="tipos_de_trabalho")
public class TipoDeTrabalho extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 2915131219727148871L;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
