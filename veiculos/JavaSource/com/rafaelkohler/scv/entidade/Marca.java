package com.rafaelkohler.scv.entidade;

import javax.validation.constraints.NotBlank;

/**
 * Representa a {@link Marca} de um Automóvel.
 * 
 * @author Rafael Kohler
 *
 */
public class Marca {

	@NotBlank
	private String nome;

	@NotBlank
	private String descricao;

	public Marca() {

	}

	public Marca(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
