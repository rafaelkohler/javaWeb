package com.rafaelkohler.cadastrousuario.managed;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.rafaelkohler.cadastrousuario.entity.Cliente;
import com.rafaelkohler.cadastrousuario.model.ServicoCliente;
import com.rafaelkohler.cadastrousuario.util.JSFUtil;

@Named
@RequestScoped
public class UsuarioMB {

	@EJB
	private ServicoCliente servicoCliente;
	private Cliente cliente;
	private List<Cliente> clientes;

	public UsuarioMB() {
		this.cliente = new Cliente();
	}

	public void excluirUsuario(Cliente cliente) {
		this.servicoCliente.removerCliente(cliente);
		JSFUtil.enviarMensagem("Usuário removido!");
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getClientes() {
		if(this.clientes == null || this.clientes.isEmpty()) {
			this.clientes = this.servicoCliente.listar();
		}
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
}
