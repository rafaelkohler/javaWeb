package com.rafaelkohler.cadastrousuario.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Estado {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_ESTADO")
	@SequenceGenerator(name = "NUM_SEQ_ESTADO", sequenceName = "NUM_SEQ_ESTADO", allocationSize = 0)
	private Integer Id;
	
	@OneToMany(mappedBy = "estado", fetch = FetchType.LAZY)
	private List<Cliente> clientes;
	
	private String nome;
	
	public Estado() {
	}
	
	public Estado(String nome) {
		this.nome = nome;
	}
	
	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		Id = id;
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
