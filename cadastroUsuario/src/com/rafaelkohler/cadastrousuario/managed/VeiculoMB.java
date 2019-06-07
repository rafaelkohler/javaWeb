package com.rafaelkohler.cadastrousuario.managed;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.rafaelkohler.cadastrousuario.entity.Veiculo;
import com.rafaelkohler.cadastrousuario.model.ServicoVeiculo;
import com.rafaelkohler.cadastrousuario.util.JSFUtil;

@Named
@RequestScoped
public class VeiculoMB {

	@EJB
	private ServicoVeiculo servicoVeiculo;
	private Veiculo veiculo;
	
	

	public VeiculoMB() {
		this.veiculo = new Veiculo();
	}

	public void salvarVeiculo() {
		this.servicoVeiculo.cadastrarVeiculo(this.veiculo);
		JSFUtil.enviarMensagem("Veículo cadastrado com sucesso!");
		veiculo = new Veiculo();
	}

	public List<Veiculo> listarVeiculos() {
		return this.servicoVeiculo.listar();
	}

	public void excluirVeiculo(Veiculo veiculo) {
		this.servicoVeiculo.excluirVeiculo(veiculo);
		JSFUtil.enviarMensagem("Veículo excluído com sucesso!");
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
