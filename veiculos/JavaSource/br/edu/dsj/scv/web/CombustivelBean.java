package br.edu.dsj.scv.web;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.edu.dsj.scv.enumerado.Combustivel;

@Named
@ApplicationScoped
public class CombustivelBean {

	public Combustivel[] listarCombustiveis() {
		return Combustivel.values();
	}

}
