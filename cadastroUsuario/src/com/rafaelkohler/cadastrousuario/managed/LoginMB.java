package com.rafaelkohler.cadastrousuario.managed;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.rafaelkohler.cadastrousuario.entity.Usuario;
import com.rafaelkohler.cadastrousuario.model.ServicoUsuario;
import com.rafaelkohler.cadastrousuario.util.JSFUtil;

@Named
@RequestScoped
public class LoginMB {

	private Usuario usuario;

	public LoginMB() {
		this.usuario = new Usuario();
	}

	public void cadastrarUsuario() {
		ServicoUsuario.cadastrarUsuario(this.usuario);
		this.usuario = new Usuario();
		JSFUtil.enviarMensagem("Usu�rio cadastrado");
	}

	public ArrayList<Usuario> listarUsuario() {
		return ServicoUsuario.listar();
	}

	public void excluirUsuario(Usuario usuario) {
		ServicoUsuario.removerUsuario(usuario);
		JSFUtil.enviarMensagem("Usu�rio removido!");
	}

	public void logado(Usuario usu) {
		if (usu.getLogin() == this.usuario.getLogin() && usu.getSenha() == this.usuario.getSenha()) {

			return;
		} else {
			JSFUtil.enviarMensagem("Usu�rio j� cadastrado!");
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
