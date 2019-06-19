package com.rafaelkohler.cadastrousuario.managed;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.rafaelkohler.cadastrousuario.entity.Cliente;
import com.rafaelkohler.cadastrousuario.entity.Esporte;
import com.rafaelkohler.cadastrousuario.entity.Estado;
import com.rafaelkohler.cadastrousuario.model.ServicoCliente;
import com.rafaelkohler.cadastrousuario.model.ServicoEsportes;
import com.rafaelkohler.cadastrousuario.model.ServicoEstado;
import com.rafaelkohler.cadastrousuario.util.JSFUtil;

@Named
@RequestScoped
public class CadastrarUsuarioMB {

	@EJB
	private ServicoCliente servicoCliente;
	@EJB
	private ServicoEsportes servicoEsporte;
	@EJB
	private ServicoEstado servicoEstado;

	private Cliente cliente;
	private List<Esporte> esportes;
	private List<Estado> estados;

	public CadastrarUsuarioMB() {
		this.cliente = new Cliente();
	}

	public void cadastrarUsuario() {
		this.servicoCliente.cadastrarCliente(this.cliente);
		JSFUtil.enviarMensagem("Usuário cadastrado!");
		this.cliente = new Cliente();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente pessoa) {
		this.cliente = pessoa;
	}

	public List<Esporte> getEsportes() {
		if (this.esportes == null || this.esportes.isEmpty()) {
			this.esportes = this.servicoEsporte.listar();
		}
		return esportes;
	}

	public void setEsportes(List<Esporte> esporte) {
		this.esportes = esporte;
	}

	public List<Estado> getEstados() {
		if (this.estados == null || this.estados.isEmpty()) {
			this.estados = this.servicoEstado.listar();
		}
		return estados;
	}

	public void setEstados(List<Estado> estados) {
		this.estados = estados;
	}

}
