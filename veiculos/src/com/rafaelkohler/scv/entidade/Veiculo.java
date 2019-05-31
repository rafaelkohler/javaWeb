package com.rafaelkohler.scv.entidade;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.rafaelkohler.scv.enumerado.Combustivel;

/**
 * Representa um veículo
 * 
 * @author Rafael Kohler
 *
 */

public class Veiculo {

	@NotNull
	private Marca marca;

	private String modelo;

	private String placa;

	private Date dataEmplacamento;

	private String cor;

	private Integer anoModelo;

	private Integer anoFabricacao;

	@NotNull
	private Combustivel combustivel;

	private Double precoFipe;

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Double getPrecoFipe() {
		return precoFipe;
	}

	public void setPrecoFipe(Double precoFipe) {
		this.precoFipe = precoFipe;
	}

	public Date getDataEmplacamento() {
		return dataEmplacamento;
	}

	public void setDataEmplacamento(Date dataEmplacamento) {
		this.dataEmplacamento = dataEmplacamento;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

}
