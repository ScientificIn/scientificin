package com.scientificin.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Email;

import com.scientificin.entities.options.GrandeAreaDoConhecimento;
import com.scientificin.entities.options.Instituicao;

@Entity
public class Sci {

	@Id
	@Email
	@Column(length = 128, nullable = false, unique = true)
	String username;
	@Column(nullable = false, length = 256)
	String password;
	@Column(length = 1000)
	String biografia;
	@Column(length = 100)
	String nome;

	@ManyToOne
	Instituicao instituicao;
	@ManyToOne
	GrandeAreaDoConhecimento areaDeAtuacao;
	@OneToMany(fetch = FetchType.EAGER)
	List<Trabalho> trabalhos;
	@OneToMany(fetch = FetchType.EAGER)
	List<Conferencia> conferencias;

	public Sci() {
		super();
	}

	public Sci(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public Sci(String nome, String email, String senha, Instituicao instituicao,
			GrandeAreaDoConhecimento areaDeAtuacao) {
		this.nome = nome;
		this.username = email;
		this.password = senha;
		this.instituicao = instituicao;
		this.areaDeAtuacao = areaDeAtuacao;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public GrandeAreaDoConhecimento getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public void setAreaDeAtuacao(GrandeAreaDoConhecimento areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}

	public List<Trabalho> getTrabalhos() {
		return trabalhos;
	}

	public void setTrabalhos(List<Trabalho> trabalhos) {
		this.trabalhos = trabalhos;
	}

	public List<Conferencia> getConferencias() {
		return conferencias;
	}

	public void setConferencias(List<Conferencia> conferencias) {
		this.conferencias = conferencias;
	}

}
