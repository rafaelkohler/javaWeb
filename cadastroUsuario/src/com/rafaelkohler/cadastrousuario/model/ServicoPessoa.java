package com.rafaelkohler.cadastrousuario.model;

import java.util.ArrayList;

import com.rafaelkohler.cadastrousuario.entity.Pessoa;

public class ServicoPessoa {

	private static ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();

	public static void cadastrarPessoa(Pessoa pessoa) {
		pessoasCadastradas.add(pessoa);
	}

	public static ArrayList<Pessoa> listar() {
		return pessoasCadastradas;
	}

	public static void removerPessoa(Pessoa pessoa) {
		pessoasCadastradas.remove(pessoa);
	}
}
