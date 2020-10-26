package br.com.helciodasilva.lojavirtual.boleto;

import java.util.List;

public class Fatura {

	private String cliente;
	private double valor;
	private List<Pagamento> pagamentos;
	private boolean pago;

	public Fatura(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public boolean isPago() {
		return pago;
	}

	public double getValor() {
		return valor;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

}
