package com.scientificin.entities;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class Sci extends AbstractPersistable<Long> implements UserDetails {
	

	private static final long serialVersionUID = -362867738177003476L;

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
	@OneToMany
	List<Trabalho> trabalhos;
	@OneToMany
	List<Conferencia> conferencias;

	boolean enabled;
	boolean credentialsExpired;
	boolean locked;
	boolean accountExpired;
	
	public Sci() {
		super();
	}

	public Sci(String username, String password) {
		this.username = username;
		this.password = password;
		this.enabled = true;
		this.credentialsExpired = false;
		this.locked = false;
		this.accountExpired = false;
	}

	public Sci(String nome, String email, String senha, Instituicao instituicao, GrandeAreaDoConhecimento areaDeAtuacao) {
		this.nome = nome;
		this.username = email;
		this.password = senha;
		this.instituicao = instituicao;
		this.areaDeAtuacao = areaDeAtuacao;
		this.enabled = true;
		this.credentialsExpired = false;
		this.locked = false;
		this.accountExpired = false;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return Arrays.asList(new SimpleGrantedAuthority("IN"));
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return accountExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return locked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return credentialsExpired;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	public void setCredentialsExpired(boolean credentialsExpired) {
		this.credentialsExpired = credentialsExpired;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public void setAccountExpired(boolean accountExpired) {
		this.accountExpired = accountExpired;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Long getId() {
		return super.getId();
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
