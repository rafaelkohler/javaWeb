package com.rafaelkohler.cadastrousuario.managed;

import java.util.ArrayList;
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
	private List<Veiculo> veiculos;
	
	public VeiculoMB() {
		this.veiculo = new Veiculo();
		this.veiculos = new ArrayList<>();
	}

	public void salvarVeiculo() {
		this.servicoVeiculo.cadastrarVeiculo(this.veiculo);
		JSFUtil.enviarMensagem("Veículo cadastrado!");
		veiculo = new Veiculo();
	}

	public List<Veiculo> listarVeiculos() {
		return this.servicoVeiculo.listar();
	}

	public void excluirVeiculo(Veiculo veiculo) {
		this.servicoVeiculo.excluirVeiculo(veiculo);
		JSFUtil.enviarMensagem("Veículo excluído!");
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public List<Veiculo> getVeiculos() {
		if(this.veiculos == null || this.veiculos.isEmpty()) {
			this.veiculos = servicoVeiculo.listar();
		}
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
}
