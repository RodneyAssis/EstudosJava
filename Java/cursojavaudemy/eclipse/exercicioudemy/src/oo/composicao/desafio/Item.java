package oo.composicao.desafio;

public class Item {
	int quantidade;
	Produto produto;
	
	public Item(Produto pdt, int qtd) {
		this.produto = pdt;
		this.quantidade = qtd;
	}

}
