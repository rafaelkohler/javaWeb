package com.rafaelkohler.cadastrousuario.enumarator;

public enum TipoEsporte {

	FUTEBOL("Futebol"),
	VOLEI("Volei"),
	BASQUETE("Basquete"),
	NATACAO("Natação"),
	POQUER("Pôquer"),
	DOIS_OU_UM("Dois ou um"),
	PARA_OU_IMPAR("Par ou impar"),
	SUPER_TRUNFO("Super trunfo");

	private String nome;

	private TipoEsporte(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
