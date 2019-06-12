package com.rafaelkohler.cadastrousuario.model;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.rafaelkohler.cadastrousuario.entity.Usuario;

@Stateless
public class ServicoUsuario {

	@PersistenceContext
	private EntityManager entityManager;
	
	private List<Usuario> usuarios = new ArrayList<>();

	public void cadastrarUsuario(Usuario usuario) {
		this.entityManager.persist(usuario);
	}

	public void removerUsuario(Usuario usuario) {
		this.entityManager.remove(this.entityManager.merge(usuario));
	}

	public List<Usuario> listar() {
		if(usuarios == null || usuarios.isEmpty()) {
			usuarios = this.entityManager.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
		}
		return usuarios;
	}

	public boolean existe(Usuario usu) {
		if(usuarios == null || usuarios.isEmpty()) {
			listar();
		}
		List<Usuario> usuariosCadastrados = usuarios;
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

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
