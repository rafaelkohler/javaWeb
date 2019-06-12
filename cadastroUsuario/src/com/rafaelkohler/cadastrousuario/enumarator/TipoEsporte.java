package com.rafaelkohler.cadastrousuario.enumarator;

public enum TipoEsporte {

	FUTEBOL("Futebol"),
	VOLEI("Volei"),
	BASQUETE("Basquete"),
	NATACAO("Nata��o"),
	POQUER("P�quer"),
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
