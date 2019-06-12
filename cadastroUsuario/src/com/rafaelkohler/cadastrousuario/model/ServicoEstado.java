package com.rafaelkohler.cadastrousuario.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.rafaelkohler.cadastrousuario.entity.Estado;
import com.rafaelkohler.cadastrousuario.enumarator.TipoEstados;

@Stateless
public class ServicoEstado {

	@PersistenceContext
	private EntityManager entityManager;

	private void cargaInicialEstado() {
		for (TipoEstados tipoEstados : TipoEstados.values()) {
			this.entityManager.persist(new Estado(tipoEstados.getNome()));
		}
	}

	public List<Estado> listar() {
		List<Estado> estados = this.entityManager.createQuery("SELECT e FROM Estado e", Estado.class).getResultList();

		if (estados.isEmpty()) {
			this.cargaInicialEstado();
			estados = listar();
		}
		return estados;
	}
}
