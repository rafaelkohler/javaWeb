package com.rafaelkohler.cadastrousuario.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.rafaelkohler.cadastrousuario.enumarator.Combustivel;

/**
 * Representa um veículo
 * 
 * @author Rafael Kohler
 *
 */
@Entity
@Table(name = "veiculo")
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_VEICULO")
	@SequenceGenerator(name = "NUM_SEQ_VEICULO", sequenceName = "NUM_SEQ_VEICULO", allocationSize = 0)
	private Integer id;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_marca")
	private Marca marca;

	@NotNull
	private String modelo;

	private String placa;

	@Column(name = "data_emplacamento")
	private Date dataEmplacamento;

	private String cor;

	@Column(name = "ano_modelo")
	private Integer anoModelo;

	@Column(name = "ano_fabricacao")
	private Integer anoFabricacao;

	@Enumerated(value = EnumType.STRING)
	private Combustivel combustivel;

	@Column(name = "preco_fipe")
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
