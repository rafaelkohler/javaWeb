package com.rafaelkohler.cadastrousuario.managed;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.rafaelkohler.cadastrousuario.entity.Pessoa;
import com.rafaelkohler.cadastrousuario.entity.Usuario;
import com.rafaelkohler.cadastrousuario.model.ServicoPessoa;
import com.rafaelkohler.cadastrousuario.model.ServicoUsuario;
import com.rafaelkohler.cadastrousuario.util.JSFUtil;

@Named
@RequestScoped
public class UsuarioMB {

	private Pessoa pessoa;

	public UsuarioMB() {
		this.pessoa = new Pessoa();
	}

	public ArrayList<Pessoa> listarUsuario() {
		return ServicoPessoa.listar();
	}

	public void excluirUsuario(Pessoa pessoa) {
		ServicoPessoa.removerPessoa(pessoa);
		JSFUtil.enviarMensagem("Usuário removido!");
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
