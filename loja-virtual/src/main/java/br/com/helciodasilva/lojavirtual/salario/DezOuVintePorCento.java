package br.com.helciodasilva.lojavirtual.salario;

public class DezOuVintePorCento implements RegraDeCalculo {
	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalario() > 3000) {
			return funcionario.getSalario() * 0.8;
		}
		return funcionario.getSalario() * 0.9;
	}
}
