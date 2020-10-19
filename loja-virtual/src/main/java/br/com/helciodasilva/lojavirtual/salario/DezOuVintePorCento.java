package br.com.helciodasilva.lojavirtual.salario;

public class DezOuVintePorCento extends RegraDeCalculo {
	@Override
	protected double porcentagemBase() {
		return 0.9;
	}

	@Override
	protected double porcentagemAcimaDoLimite() {
		return 0.8;
	}

	@Override
	protected int limite() {
		return 3000;
	}
}
