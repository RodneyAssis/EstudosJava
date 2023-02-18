package estoque;

public class Item {
	int quantidade;
	Produto p;
	
	public Item(Produto p, int quantidade) {
		// TODO Auto-generated constructor stub
		this.quantidade = quantidade;
		this.p = p;
	}
	
	public Item(String tipo, String marca, double preco, int quantidade) {
		this.p.tipo = tipo;
		this.p.marca = marca;
		this.p.preco = preco;
		this.quantidade = quantidade;
	}
	
	
	void qtdNegativa() {
		if (quantidade <= 0) {
			this.quantidade = 0;
		}
	}
	
}
