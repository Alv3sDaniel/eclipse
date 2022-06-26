package com.badlogic.drop;

public class Protagonista {
	private String nome;
	private int municao;
	private int sanidade;
	private int linha;
	private int coluna;
	
	public Protagonista() {
		this.nome = "Jonathan";
		this.municao = 5;
		this.sanidade = 10;
		this.linha = 0;
		this.coluna = 0;
	}

	public int getMunicao() {
		return municao;
	}

	public void setMunicao(int municao) {
		this.municao = municao;
	}

	public int getSanidade() {
		return sanidade;
	}

	public void setSanidade(int sanidade) {
		this.sanidade = sanidade;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public String getNome() {
		return nome;
	}
}
