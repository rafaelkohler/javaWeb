package com.rafaelkohler.cadastrousuario.entity;

import javax.validation.constraints.NotBlank;

public class Usuario {

	@NotBlank
	private String login;

	@NotBlank
	private String senha;

	public Usuario() {
	}

	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
