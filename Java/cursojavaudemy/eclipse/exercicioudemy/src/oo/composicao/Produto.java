package oo.composicao;

import java.util.ArrayList;

public class Produto {
	
	String clientes;
	ArrayList<Item> itens = new ArrayList<>();

	void adicionarItens(Item item) {
		itens.add(item);
		item.produto = this;
	}
	
	double obterTotal() {
		double Total = 0;
		for (Item it : itens) {
			Total += it.preco * it.quantidade;
		}
		return Total;
	}
	
	void visualizarLista() {
		for (Item it1 : itens) {
			System.out.printf("Nome: %s Qtd: %d Preco: %.2fR$\n", it1.nome, it1.quantidade, it1.preco);
		}
	}
	
}
