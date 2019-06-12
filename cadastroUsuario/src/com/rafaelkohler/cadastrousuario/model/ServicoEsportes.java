package com.rafaelkohler.cadastrousuario.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.rafaelkohler.cadastrousuario.entity.Esporte;
import com.rafaelkohler.cadastrousuario.enumarator.TipoEsporte;

@Stateless
public class ServicoEsportes {

	@PersistenceContext
	private EntityManager entityManager;

	private void cargaInicialEsportes() {
		for (TipoEsporte tipoEsporte : TipoEsporte.values()) {
			this.entityManager.persist(new Esporte(tipoEsporte.getNome()));
		}
	}

	public List<Esporte> listar() {
		List<Esporte> esportes = this.entityManager.createQuery("SELECT e FROM Esporte e", Esporte.class)
				.getResultList();

		if (esportes.isEmpty()) {
			this.cargaInicialEsportes();
			esportes = listar();
		}
		return esportes;
	}
}
