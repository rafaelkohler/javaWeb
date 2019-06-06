package com.rafaelkohler.scv.modelo;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.rafaelkohler.scv.entidade.Veiculo;

@Stateless
public class ServicoVeiculo {

	@PersistenceContext(unitName = "veiculo")
	private EntityManager entityManager;

	public void cadastrarVeiculo(Veiculo veiculo) {
		this.entityManager.persist(veiculo);
	}

	public List<Veiculo> listar() {
		return this.entityManager.createQuery("FROM Veiculo v", Veiculo.class).getResultList();
	}

	public void excluirVeiculo(Veiculo veiculo) {
		this.entityManager.remove(this.entityManager.merge(veiculo));
	}

}
