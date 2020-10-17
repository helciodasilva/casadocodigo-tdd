package br.com.helciodasilva.lojavirtual.carrinho;
import br.com.helciodasilva.lojavirtual.CarrinhoDeCompras;

public class CarrinhoDeComprasBuilder {
    public CarrinhoDeCompras carrinho;

    public CarrinhoDeComprasBuilder() {
        this.carrinho = new CarrinhoDeCompras();
    }

    public CarrinhoDeComprasBuilder comItens(double... valores) {
        for (double valor : valores) {
            carrinho.adiciona(new Item("item", 1, valor));
        }
        return this;
    }

    public CarrinhoDeCompras cria() {
        return carrinho;
    }
}