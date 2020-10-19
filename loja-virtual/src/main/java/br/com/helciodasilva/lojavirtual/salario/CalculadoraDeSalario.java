package br.com.helciodasilva.lojavirtual.salario;

public class CalculadoraDeSalario {

	public double calculaSalario(Funcionario funcionario) {
		if (funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)) {
			return dezOuVintePorCentoDeDesconto(funcionario);
		} else if (funcionario.getCargo().equals(Cargo.DBA) || funcionario.getCargo().equals(Cargo.TESTADOR)) {
			return quinzeOuVinteCincoPorCentoDeDesconto(funcionario);
		}
		throw new RuntimeException("Funcionario invalido");
	}

	private double quinzeOuVinteCincoPorCentoDeDesconto(Funcionario funcionario) {
		if (funcionario.getSalario() < 2500) {
			return funcionario.getSalario() * 0.85;
		}
		return funcionario.getSalario() * 0.75;
	}

	private double dezOuVintePorCentoDeDesconto(Funcionario funcionario) {
		if (funcionario.getSalario() > 3000) {
			return funcionario.getSalario() * 0.8;
		}
		return funcionario.getSalario() * 0.9;
	}

}
