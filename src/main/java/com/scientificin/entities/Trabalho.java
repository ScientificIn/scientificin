package com.scientificin.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Trabalho extends AbstractPersistable<Long> {
	
	public enum TipoDeTrabalho {
		Artigo,
		Livro,
		ProjetoDePesquisa
	}

	private static final long serialVersionUID = 8901353480917316536L;

	@Column(length = 512)
	String notasDoAutor;
	@Column(length = 256)
	String titulo;
	@Column
	String texto;
	@Column
	Integer posicao;

	@Column
    @Enumerated(EnumType.STRING)
	TipoDeTrabalho tipoDeTrabalho;
	@Column
	Integer posicaoNaArea;
	@Column
	Integer posicaoNaSubArea;

	@OneToMany
	List<Avaliacao> avaliacoes;
	@OneToMany
	List<Recurso> recursos;
	@OneToMany
	List<Bibliografia> bibliografias;

	@Enumerated
	AreaDoConhecimento area;
	@Enumerated
	SubAreaDoConhecimento subArea;

	public String getNotasDoAutor() {
		return notasDoAutor;
	}

	public void setNotasDoAutor(String notasDoAutor) {
		this.notasDoAutor = notasDoAutor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public Integer getPosicaoNaArea() {
		return posicaoNaArea;
	}

	public void setPosicaoNaArea(Integer posicaoNaArea) {
		this.posicaoNaArea = posicaoNaArea;
	}

	public Integer getPosicaoNaSubArea() {
		return posicaoNaSubArea;
	}

	public void setPosicaoNaSubArea(Integer posicaoNaSubArea) {
		this.posicaoNaSubArea = posicaoNaSubArea;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public List<Recurso> getRecursos() {
		return recursos;
	}

	public void setRecursos(List<Recurso> recursos) {
		this.recursos = recursos;
	}

	public List<Bibliografia> getBibliografias() {
		return bibliografias;
	}

	public void setBibliografias(List<Bibliografia> bibliografias) {
		this.bibliografias = bibliografias;
	}

	public AreaDoConhecimento getArea() {
		return area;
	}

	public void setArea(AreaDoConhecimento area) {
		this.area = area;
	}

	public SubAreaDoConhecimento getSubArea() {
		return subArea;
	}

	public void setSubArea(SubAreaDoConhecimento subArea) {
		this.subArea = subArea;
	}

}
