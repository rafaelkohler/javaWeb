package com.rafaelkohler.cadastrousuario.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.rafaelkohler.cadastrousuario.enumarator.Esporte;
import com.rafaelkohler.cadastrousuario.enumarator.Estados;
import com.rafaelkohler.cadastrousuario.managed.EstadoMB;

public class Pessoa {
	
	private String nomeCompleto;
	private String cpf;
	private String rg;
	private Usuario usuario;
	private Date dataNascimento;
	private String sexo;
	private String estado;
	
	private List<Esporte> esportesFavorito;

	public Pessoa() {
		this.usuario = new Usuario();
		this.esportesFavorito = new ArrayList<Esporte>();
		
	}
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Esporte> getEsportesFavorito() {
		return esportesFavorito;
	}

	public void setEsportesFavorito(List<Esporte> esportesFavorito) {
		this.esportesFavorito = esportesFavorito;
	}
	
}
