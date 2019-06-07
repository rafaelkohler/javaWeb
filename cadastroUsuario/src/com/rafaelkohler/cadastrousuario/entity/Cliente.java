package com.rafaelkohler.cadastrousuario.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.rafaelkohler.cadastrousuario.enumarator.Estados;

@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_CLIENTE")
	@SequenceGenerator(name = "NUM_SEQ_CLIENTE", sequenceName = "NUM_SEQ_CLIENTE", allocationSize = 0)
	private Integer id;
	
	private String nomeCompleto;
	private String cpf;
	private String rg;
	private Date dataNascimento;
	private String sexo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@Enumerated(value = EnumType.STRING)
	private Estados estado;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
	private List<Esportes> esportesFavorito;
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexoString() {
		return sexo != null && !sexo.isEmpty() && sexo.equals("1") ? "Masculino" : "Feminino";
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public List<Esportes> getEsportesFavorito() {
		return esportesFavorito;
	}

	public void setEsportesFavorito(List<Esportes> esportesFavorito) {
		this.esportesFavorito = esportesFavorito;
	}

}
