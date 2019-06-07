package com.rafaelkohler.cadastrousuario.model;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.rafaelkohler.cadastrousuario.entity.Usuario;

@Stateless
public class ServicoUsuario {

	@PersistenceContext
	private EntityManager entityManager;

	public void cadastrarUsuario(Usuario usuario) {
		this.entityManager.persist(usuario);
	}

	public void removerUsuario(Usuario usuario) {
		this.entityManager.remove(this.entityManager.merge(usuario));
	}

	public List<Usuario> listar() {
		return this.entityManager.createQuery("FROM Usuario u", Usuario.class).getResultList();
	}

	public boolean existe(Usuario usu) {
		List<Usuario> usuariosCadastrados = listar();
		if (usuariosCadastrados != null && !usuariosCadastrados.isEmpty()) {
			for (Usuario usuario : usuariosCadastrados) {
				if (usu.getLogin().equals(usuario.getLogin()) && usu.getSenha().equals(usuario.getSenha())) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

}
