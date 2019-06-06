package com.rafaelkohler.scv.web;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.rafaelkohler.scv.entidade.Marca;
import com.rafaelkohler.scv.modelo.ServicoMarca;
import com.rafaelkohler.scv.web.util.JSFUtils;

@Named
@RequestScoped
public class MarcaBean {

	@EJB
	private ServicoMarca servicoMarca;
	private Marca marca;
	private List<Marca> marcas = new ArrayList<Marca>();

	public MarcaBean() {
		this.marca = new Marca();
	}

	public void salvarMarca() {
		this.servicoMarca.cadastrarMarca(this.marca);
		this.marca = new Marca();
		JSFUtils.enviarMensagemDeSucesso("Marca cadastrada com sucesso!");
	}

	public void excluirMarca(Marca marca) {
		this.servicoMarca.excluirMarca(marca);
		JSFUtils.enviarMensagemDeSucesso("Marca excluída com sucesso!");
	}

	public List<Marca> listarMarcas() {
		return marcas = this.servicoMarca.listar();
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Marca> getMarcas() {
		return marcas;
	}

	public void setMarcas(List<Marca> marcas) {
		this.marcas = marcas;
	}

	
}
