package com.rafaelkohler.cadastrousuario.managed;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.rafaelkohler.cadastrousuario.entity.Usuario;
import com.rafaelkohler.cadastrousuario.model.ServicoUsuario;
import com.rafaelkohler.cadastrousuario.util.JSFUtil;

@Named
@RequestScoped
public class LoginMB {

	@EJB
	private ServicoUsuario servicoUsuario;
	private Usuario usuario;
	private List<Usuario> usuarios;

	public LoginMB() {
		this.usuario = new Usuario();
	}

	public void cadastrarUsuario() {
		this.servicoUsuario.cadastrarUsuario(this.usuario);
		this.usuario = new Usuario();
		JSFUtil.enviarMensagem("Usuário cadastrado");
	}

	public void excluirUsuario(Usuario usuario) {
		this.servicoUsuario.removerUsuario(usuario);
		JSFUtil.enviarMensagem("Usuário removido!");
	}
	
	public String formUsuario() {
		return "cadastrarusuario?faces-redirect=true";
	}

	public String efetuaLogin() {
		boolean existe = this.servicoUsuario.existe(this.usuario);
		if(existe) {
			return "usuarioscadastrados?faces-redirect=true";
		}
		this.usuario = new Usuario();
		return "login";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		if(this.usuarios == null || this.usuarios.isEmpty()) {
			this.usuarios = this.servicoUsuario.listar();
		}
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	

}
