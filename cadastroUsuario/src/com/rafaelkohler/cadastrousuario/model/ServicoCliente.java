package com.rafaelkohler.cadastrousuario.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.rafaelkohler.cadastrousuario.entity.Cliente;

@Stateless
public class ServicoCliente {

	@PersistenceContext
	private EntityManager entityManager;

	public void cadastrarCliente(Cliente cliente) {
		this.entityManager.persist(cliente);
	}

	public void removerCliente(Cliente pessoa) {
		this.entityManager.remove(this.entityManager.merge(pessoa));
	}

	public List<Cliente> listar() {
		return this.entityManager.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
}
