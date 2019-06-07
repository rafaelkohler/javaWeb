package com.rafaelkohler.cadastrousuario.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.rafaelkohler.cadastrousuario.entity.Marca;
import com.rafaelkohler.cadastrousuario.entity.Veiculo;

/**
 * Classe para teste de persistencia.
 * 
 * @author Rafael Kohler
 *
 */
@Stateless // dispara por varios clusters a implantacao do software
public class ServicoMarca {

	@PersistenceContext
	private EntityManager entityManager; // conecta com o banco

	public void cadastrarMarca(Marca marca) {
		this.entityManager.persist(marca);
	}

	public void excluirMarca(Marca marca) throws Exception {
		if (listarVeiculoPorMarca(marca).isEmpty()) {
			this.entityManager.remove(this.entityManager.merge(marca));
		} else {
			throw new Exception("Nao foi possivel remover a marca, existem veiculos associados");
		}
	}

	public List<Veiculo> listarVeiculoPorMarca(Marca marca) {
		return this.entityManager.createQuery("FROM Veiculo v WHERE v.marca=:p1", Veiculo.class)
				.setParameter("p1", marca).getResultList();
	}

	public List<Marca> listar() {
		return this.entityManager.createQuery("FROM Marca m", Marca.class).getResultList();
	}

}
