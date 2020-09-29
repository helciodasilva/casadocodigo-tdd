package br.com.helciodasilva.lojavirtual;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Produto> produtos = new ArrayList<>();

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void adiciona(Produto produto) {
		produtos.add(produto);
	}

}
