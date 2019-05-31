package com.rafaelkohler.cadastrousuario.managed;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.rafaelkohler.cadastrousuario.enumarator.Estados;

@Named
@ApplicationScoped
public class EstadoMB {
	
	public Estados[] listaEstados() {
		return Estados.values();
	}

}
