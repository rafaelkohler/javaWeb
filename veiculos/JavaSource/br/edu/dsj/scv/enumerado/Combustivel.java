package br.edu.dsj.scv.enumerado;

public enum Combustivel {
	
	GASOLINA("Gasolina pódium"),
	ETANOL("Etanol"),
	DIESEL("Diesel"),
	GNV("GNV"),
	ENERGIA_ELETRICA("Energia elétrica"),
	BIO_COMBUSTIVEL("Biocombustível");
	
	private String descricao;
	
	private Combustivel(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
