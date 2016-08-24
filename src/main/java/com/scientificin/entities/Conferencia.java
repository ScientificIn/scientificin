package com.scientificin.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@Table(name = "conferencias")
public class Conferencia extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 6440296134471816993L;
	
	private String url;
	@Column(nullable = false)
	private String cargo;
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date data;

	@ManyToOne
	private Sci sci;

	public Sci getSci() {
		return sci;
	}

	public void setSci(Sci sci) {
		this.sci = sci;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
