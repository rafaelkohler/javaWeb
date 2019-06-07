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
public class Esportes {

	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "NUM_SEQ_ESPORTE")
	@SequenceGenerator(name = "NUM_SEQ_ESPORTE", sequenceName = "NUM_SEQ_ESPORTE", allocationSize = 0)
	private Integer Id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	private static final String FUTEBOL = "Futebol";
	private static final String VOLEI = "Volei";
	private static final String BASQUETE = "Basquete";
	private static final String NATACAO = "Natação";
	private static final String POQUER = "Pôquer";
	private static final String DOIS_OU_UM = "Dois ou um";
	private static final String PARA_OU_IMPAR = "Par ou impar";
	private static final String SUPER_TRUNFO = "Super trunfo";
	
	public static String getFutebol() {
		return FUTEBOL;
	}
	public static String getVolei() {
		return VOLEI;
	}
	public static String getBasquete() {
		return BASQUETE;
	}
	public static String getNatacao() {
		return NATACAO;
	}
	public static String getPoquer() {
		return POQUER;
	}
	public static String getDoisOuUm() {
		return DOIS_OU_UM;
	}
	public static String getParaOuImpar() {
		return PARA_OU_IMPAR;
	}
	public static String getSuperTrunfo() {
		return SUPER_TRUNFO;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
