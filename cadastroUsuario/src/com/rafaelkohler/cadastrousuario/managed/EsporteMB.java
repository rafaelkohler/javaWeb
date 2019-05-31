package com.rafaelkohler.cadastrousuario.managed;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import com.rafaelkohler.cadastrousuario.enumarator.Esporte;

@Named
@ApplicationScoped
public class EsporteMB {
	
	public Esporte[] listaEsportes() {
		return Esporte.values();
	}

}
