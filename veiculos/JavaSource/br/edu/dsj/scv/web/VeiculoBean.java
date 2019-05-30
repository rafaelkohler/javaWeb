package br.edu.dsj.scv.web;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.dsj.scv.entidade.Veiculo;
import br.edu.dsj.scv.modelo.ServicoVeiculo;
import br.edu.dsj.scv.web.util.JSFUtils;

@Named
@RequestScoped
public class VeiculoBean {

	private Veiculo veiculo;

	public VeiculoBean() {
		this.veiculo = new Veiculo();
	}

	public void salvarVeiculo() {
		ServicoVeiculo.cadastrarVeiculo(this.veiculo);
		JSFUtils.enviarMensagemDeSucesso("Veículo cadastrado com sucesso!");
		JSFUtils.enviarMensagemDeSucesso(this.veiculo.getCombustivel().getDescricao());
	}

	public ArrayList<Veiculo> listarVeiculos() {
		return ServicoVeiculo.listar();
	}

	public void excluirVeiculo(Veiculo veiculo) {
		ServicoVeiculo.excluirVeiculo(veiculo);
		JSFUtils.enviarMensagemDeSucesso("Veículo excluído com sucesso!");
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
