package br.edu.dsj.scv.web;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.dsj.scv.entidade.Marca;
import br.edu.dsj.scv.modelo.ServicoMarca;
import br.edu.dsj.scv.web.util.JSFUtils;

@Named
@RequestScoped
public class MarcaBean {

	private Marca marca;

	public MarcaBean() {
		this.marca = new Marca();
	}

	public void salvarMarca() {
		ServicoMarca.cadastrarMarca(this.marca);
		this.marca = new Marca();
		JSFUtils.enviarMensagemDeSucesso("Marca cadastrada com sucesso!");
	}

	public void excluirMarca(Marca marca) {
		ServicoMarca.excluirMarca(marca);
		JSFUtils.enviarMensagemDeSucesso("Marca excluída com sucesso!");
	}

	public ArrayList<Marca> listarMarcas() {
		return ServicoMarca.listar();
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
