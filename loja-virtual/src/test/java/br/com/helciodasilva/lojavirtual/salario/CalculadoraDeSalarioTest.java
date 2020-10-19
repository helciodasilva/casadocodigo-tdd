package br.com.helciodasilva.lojavirtual.salario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraDeSalarioTest {

	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(1500.0 * 0.9, salario, 0.00001);
	}

	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(4000.0 * 0.8, salario, 0.00001);
	}

	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario dba = new Funcionario("Mauricio", 500.0, Cargo.DBA);
		double salario = calculadora.calculaSalario(dba);
		assertEquals(500.0 * 0.85, salario, 0.00001);
	}

	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario dba = new Funcionario("Mauricio", 4500.0, Cargo.DBA);
		double salario = calculadora.calculaSalario(dba);
		assertEquals(4500.0 * 0.75, salario, 0.00001);
	}

}
