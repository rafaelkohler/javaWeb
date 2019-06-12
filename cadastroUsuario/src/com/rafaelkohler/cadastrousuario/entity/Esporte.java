package com.rafaelkohler.cadastrousuario.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Esporte {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_ESPORTE")
	@SequenceGenerator(name = "NUM_SEQ_ESPORTE", sequenceName = "NUM_SEQ_ESPORTE", allocationSize = 0)
	private Integer Id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	private String nome;
	
	public Esporte() {
	}
	
	public Esporte(String nome) {
		this.nome = nome;
	}
	
	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		Id = id;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
