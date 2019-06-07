package com.rafaelkohler.cadastrousuario.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.rafaelkohler.cadastrousuario.entity.Veiculo;

@Stateless
public class ServicoVeiculo {

	@PersistenceContext
	private EntityManager entityManager;

	public void cadastrarVeiculo(Veiculo veiculo) {
		this.entityManager.persist(veiculo);
	}

	public void excluirVeiculo(Veiculo veiculo) {
		this.entityManager.remove(this.entityManager.merge(veiculo));
	}

	public List<Veiculo> listar() {
		return this.entityManager.createQuery("SELECT v FROM Veiculo v", Veiculo.class).getResultList();
	}

}
