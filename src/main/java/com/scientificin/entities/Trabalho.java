package com.scientificin.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.scientificin.entities.options.AreaDoConhecimento;
import com.scientificin.entities.options.SubAreaDoConhecimento;
import com.scientificin.entities.options.TipoDeTrabalho;

@Entity
@Table(name = "trabalhos")
public class Trabalho extends AbstractPersistable<Long> {

	private static final long serialVersionUID = 8901353480917316536L;

	@Column(length = 512)
	private String notasDoAutor;
	@Column(length = 256)
	private String titulo;
	private String texto;
	
	private Integer posicao;
	private Integer posicaoNaArea;
	private Integer posicaoNaSubArea;

	@OneToMany
	private List<Avaliacao> avaliacoes;
	@OneToMany
	private List<Recurso> recursos;
	@OneToMany
	private List<Bibliografia> bibliografias;

	@ManyToOne
	private AreaDoConhecimento area;
	@ManyToOne
	private SubAreaDoConhecimento subArea;
	@ManyToOne
	private TipoDeTrabalho tipoDeTrabalho;
	@ManyToOne
	private Sci autor;

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

	public Sci getAutor() {
		return autor;
	}

	public void setAutor(Sci autor) {
		this.autor = autor;
	}

}
