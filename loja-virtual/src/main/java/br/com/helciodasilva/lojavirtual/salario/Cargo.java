package br.com.helciodasilva.lojavirtual.salario;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorCento()), //
	DBA(new QuinzeOuVinteCincoPorCento()), //
	TESTADOR(new QuinzeOuVinteCincoPorCento());

	private final RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
}
