package oo.composicao.desafiomeu;

public class Item extends Produto {
	int qtd;

	public Item(String nomePD, double precoPD, int qtd) {
		this.nome = nomePD;
		this.preco = precoPD;
		this.qtd = qtd;
	}

}
