package br.com.helciodasilva.lojavirtual;

public class Produto {

	private double valor;
	private String nome;

	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public String getNome() {
		return nome;
	}
	

}
