package com.scientificin.entity;

import com.scientificin.util.BaseResource;

public class User extends BaseResource {

	private String email;
	private String password;
	private String instituicao;
	private String areaDeAtuacao;

	public User() {
	}

	public User(String email, String password, String instituicao, String areaDeAtuacao) {
		this.email = email;
		this.password = password;
		this.instituicao = instituicao;
		this.areaDeAtuacao = areaDeAtuacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public void setAreaDeAtuacao(String areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}

}
