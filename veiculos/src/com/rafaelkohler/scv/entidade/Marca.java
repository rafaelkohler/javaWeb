package com.rafaelkohler.scv.entidade;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Representa a {@link Marca} de um Automóvel.
 * 
 * @author Rafael Kohler
 *
 */
@Entity
@Table(name = "marca")
public class Marca {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_MARCA")
	@SequenceGenerator(name = "NUM_SEQ_MARCA", sequenceName = "NUM_SEQ_MARCA", allocationSize = 0)
	private Integer id;
	
	private String nome;

	private String descricao;
	
	@OneToMany(mappedBy = "marca")
	private List<Veiculo> veiculos;

	public Marca() {

	}

	public Marca(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
