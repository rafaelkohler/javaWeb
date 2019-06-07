package com.rafaelkohler.scv.modelo;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.rafaelkohler.scv.entidade.Marca;

/**
 * Classe para teste de persistencia.
 * 
 * @author Rafael Kohler
 *
 */
@Stateless //dispara por varios clusters a implantacao do software
public class ServicoMarca {

	@PersistenceContext
	private EntityManager entityManager; //conecta com o banco
	
	public void cadastrarMarca(Marca marca) {
		this.entityManager.persist(marca);
	}

	public void excluirMarca(Marca marca) {
		this.entityManager.remove(this.entityManager.merge(marca));
	}

	public List<Marca> listar() {
		return this.entityManager.createQuery("FROM Marca m", Marca.class).getResultList();
	}
	
}
