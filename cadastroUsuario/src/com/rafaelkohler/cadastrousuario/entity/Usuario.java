package com.rafaelkohler.cadastrousuario.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_USUARIO")
	@SequenceGenerator(name =  "NUM_SEQ_USUARIO", sequenceName = "NUM_SEQ_USUARIO", allocationSize = 0)
	private Integer id;

	@NotBlank
	private String login;

	@NotBlank
	private String senha;
	
	@OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY)
	private Cliente cliente;

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
