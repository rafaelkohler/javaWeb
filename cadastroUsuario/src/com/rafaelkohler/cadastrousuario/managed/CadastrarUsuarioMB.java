package com.rafaelkohler.cadastrousuario.managed;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.rafaelkohler.cadastrousuario.entity.Cliente;
import com.rafaelkohler.cadastrousuario.model.ServicoCliente;
import com.rafaelkohler.cadastrousuario.model.ServicoUsuario;
import com.rafaelkohler.cadastrousuario.util.JSFUtil;

@Named
@RequestScoped
public class CadastrarUsuarioMB {
	
	@EJB
	private ServicoUsuario servicoUsuario;
	
	@EJB
	private ServicoCliente servicoCliente;
	
	private Cliente cliente;
	
	public CadastrarUsuarioMB() {
		this.cliente = new Cliente();
	}
	
	public void cadastrarUsuario() {
		this.servicoCliente.cadastrarCliente(this.cliente);
		this.servicoUsuario.cadastrarUsuario(this.cliente.getUsuario());
		JSFUtil.enviarMensagem("Usuário cadastrado!");
		this.cliente = new Cliente();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente pessoa) {
		this.cliente = pessoa;
	}
	
	
}
