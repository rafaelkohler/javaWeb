package com.rafaelkohler.cadastrousuario.managed;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.rafaelkohler.cadastrousuario.entity.Marca;
import com.rafaelkohler.cadastrousuario.model.ServicoMarca;
import com.rafaelkohler.cadastrousuario.util.JSFUtil;

@Named
@RequestScoped
public class MarcaMB {

	@EJB
	private ServicoMarca servicoMarca;
	private Marca marca;
	private List<Marca> marcas;

	public MarcaMB() {
		this.marca = new Marca();
		this.marcas = new ArrayList<>();
	}

	public void salvarMarca() {
		this.servicoMarca.cadastrarMarca(this.marca);
		this.marca = new Marca();
		JSFUtil.enviarMensagem("Marca cadastrada com sucesso!");
	}

	public void excluirMarca(Marca marca) {
		try {
			this.servicoMarca.excluirMarca(marca);
			JSFUtil.enviarMensagem("Marca excluída com sucesso!");
		} catch (Exception e) {
			JSFUtil.enviarMensagemDeAtencao(e.getMessage());
			e.printStackTrace();
		}
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public List<Marca> getMarcas() {
		if(this.marcas == null || this.marcas.isEmpty()) {
			this.marcas = this.servicoMarca.listar();
		}
		return marcas;
	}

	public void setMarcas(List<Marca> marcas) {
		this.marcas = marcas;
	}

	
}
