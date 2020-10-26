package br.com.helciodasilva.lojavirtual.boleto;

public class Pagamento {

	private double valor;
	private MeioDePagamento boleto;

	public Pagamento(double valor, MeioDePagamento boleto) {
		this.valor = valor;
		this.boleto = boleto;
	}

	public double getValor() {
		return valor;
	}

}
