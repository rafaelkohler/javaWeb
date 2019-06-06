package com.rafaelkohler.scv.web;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.rafaelkohler.scv.entidade.Veiculo;
import com.rafaelkohler.scv.modelo.ServicoVeiculo;
import com.rafaelkohler.scv.web.util.JSFUtils;

@Named
@RequestScoped
public class VeiculoBean {

	@EJB
	private ServicoVeiculo servicoVeiculo;
	private Veiculo veiculo;
	

	public VeiculoBean() {
		this.veiculo = new Veiculo();
	}

	public void salvarVeiculo() {
		this.servicoVeiculo.cadastrarVeiculo(this.veiculo);
		JSFUtils.enviarMensagemDeSucesso("Veículo cadastrado com sucesso!");
		JSFUtils.enviarMensagemDeSucesso(this.veiculo.getCombustivel().getDescricao());
		veiculo = new Veiculo();
	}

	public List<Veiculo> listarVeiculos() {
		return this.servicoVeiculo.listar();
	}

	public void excluirVeiculo(Veiculo veiculo) {
		this.servicoVeiculo.excluirVeiculo(veiculo);
		JSFUtils.enviarMensagemDeSucesso("Veículo excluído com sucesso!");
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
