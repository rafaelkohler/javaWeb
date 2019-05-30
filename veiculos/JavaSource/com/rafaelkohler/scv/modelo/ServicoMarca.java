package com.rafaelkohler.scv.modelo;

import java.util.ArrayList;

import com.rafaelkohler.scv.entidade.Marca;

/**
 * Classe para teste de persistencia.
 * 
 * @author Rafael Kohler
 *
 */
public class ServicoMarca {

	/**
	 * Lista fake de banco de dados
	 */
	private static ArrayList<Marca> marcasCadastradas = new ArrayList<Marca>();

	static {
		marcasCadastradas.add(new Marca("Fiat","tttt"));
		marcasCadastradas.add(new Marca("Volvo","tttt"));
		marcasCadastradas.add(new Marca("Hiunday","tttt"));
		marcasCadastradas.add(new Marca("Renault","tttt"));
		marcasCadastradas.add(new Marca("Ford","tttt"));
	}
	
	public static void cadastrarMarca(Marca marca) {
		marcasCadastradas.add(marca);
	}

	public static ArrayList<Marca> listar() {
		return marcasCadastradas;
	}

	public static void excluirMarca(Marca marca) {
		marcasCadastradas.remove(marca);
	}
	
}
