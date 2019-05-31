package com.rafaelkohler.scv.web;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.rafaelkohler.scv.enumerado.Combustivel;

@Named
@ApplicationScoped
public class CombustivelBean {

	public Combustivel[] listarCombustiveis() {
		return Combustivel.values();
	}

}
