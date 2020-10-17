package br.com.helciodasilva.lojavirtual.carrinho;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.helciodasilva.lojavirtual.CarrinhoDeCompras;

public class CarrinhoDeComprasTest {

	private CarrinhoDeCompras carrinho;

	@Before
	public void inicializa() {
		this.carrinho = new CarrinhoDeComprasBuilder().comItens(200.0, 300.0).cria();
	}

	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		assertEquals(0.0, carrinho.maiorValor(), 0.0001);
	}

	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		assertEquals(900.0, carrinho.maiorValor(), 0.0001);
	}

	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		carrinho.adiciona(new Item("Fogão", 1, 1500.0));
		carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));
		assertEquals(1500.0, carrinho.maiorValor(), 0.0001);
	}

}
