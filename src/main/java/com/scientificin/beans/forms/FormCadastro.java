/**
 * 
 */
package com.scientificin.beans.forms;

import java.util.regex.Pattern;

/**
 * Formulário de cadastro
 * 
 * @author giulio
 *
 */
public class FormCadastro extends BaseForm {

	public static final Pattern VALID_EMAIL_ADDRESS_PATTERN = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	private static final short MINIMAL_PASSWORD_LENGTH = 8;

	private String email;
	private String password;
	private String confirmation;
	private Long instituicao;
	private Long areaDeAtuacao;
	private String nome;

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

	public Long getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Long instituicao) {
		this.instituicao = instituicao;
	}

	public Long getAreaDeAtuacao() {
		return areaDeAtuacao;
	}

	public void setAreaDeAtuacao(Long areaDeAtuacao) {
		this.areaDeAtuacao = areaDeAtuacao;
	}
	
	public String getConfirmation() {
		return confirmation;
	}

	public void setConfirmation(String confirmation) {
		this.confirmation = confirmation;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean validate() {
		return
				 VALID_EMAIL_ADDRESS_PATTERN.matcher(email).matches() &&
				 password.length() >= MINIMAL_PASSWORD_LENGTH && password.equals(confirmation) &&
				 instituicao != null &&
				 (nome != null && nome.length() <= 100) &&
				 areaDeAtuacao != null;
	}

}
