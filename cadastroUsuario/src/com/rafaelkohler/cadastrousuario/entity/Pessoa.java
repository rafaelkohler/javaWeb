package com.rafaelkohler.cadastrousuario.entity;

import java.util.Date;
import java.util.List;

import com.rafaelkohler.cadastrousuario.enumarator.Esporte;
import com.rafaelkohler.cadastrousuario.enumarator.Estados;

public class Pessoa {
	
	private String nomeCompleto;
	private String cpf;
	private String rg;
	private Usuario usuario;
	private Date dataNascimento;
	private String sexo;
	private Estados estado;
	
	private List<Esporte> esportesFavorito;

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

	public List<Esporte> getEsportesFavorito() {
		return esportesFavorito;
	}

	public void setEsportesFavorito(List<Esporte> esportesFavorito) {
		this.esportesFavorito = esportesFavorito;
	}
	
}
