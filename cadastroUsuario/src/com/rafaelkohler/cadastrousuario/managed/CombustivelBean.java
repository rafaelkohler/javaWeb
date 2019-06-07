package com.rafaelkohler.cadastrousuario.managed;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.rafaelkohler.cadastrousuario.enumarator.Combustivel;

@Named
@ApplicationScoped
public class CombustivelBean {

	public Combustivel[] listarCombustiveis() {
		return Combustivel.values();
	}

}
