package com.rafaelkohler.cadastrousuario.managed;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.rafaelkohler.cadastrousuario.entity.Pessoa;
import com.rafaelkohler.cadastrousuario.model.ServicoPessoa;
import com.rafaelkohler.cadastrousuario.model.ServicoUsuario;
import com.rafaelkohler.cadastrousuario.util.JSFUtil;

@Named
@RequestScoped
public class CadastrarUsuarioMB {
	
	private Pessoa pessoa;
	
	public CadastrarUsuarioMB() {
		this.pessoa = new Pessoa();
	}
	
	public void cadastrarUsuario() {
		ServicoPessoa.cadastrarPessoa(this.pessoa);
		ServicoUsuario.cadastrarUsuario(this.pessoa.getUsuario());
		JSFUtil.enviarMensagem("Usuário cadastrado!");
		this.pessoa = new Pessoa();
	}
	
	

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
