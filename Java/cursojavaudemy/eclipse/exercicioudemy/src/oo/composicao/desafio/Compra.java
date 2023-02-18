package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> item = new ArrayList<>();
	
	
	void adicionarItem(Produto p, int qtd) {
		this.item.add(new Item(p, qtd));
	}

	void adicionarItem1(String nome, double preco, int qtd) {
		var p = new Produto(nome, preco);
		this.item.add(new Item(p, qtd));
	}
	
	
	
	double obterTotal() {
		double total = 0;
		
		for (Item item2 : item) {
			total += item2.quantidade * item2.produto.precoProduto;
		}
		
		return total;
	}
}

