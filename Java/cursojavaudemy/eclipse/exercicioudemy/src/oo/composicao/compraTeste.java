package oo.composicao;

public class compraTeste {
	public static void main(String[] args) {
		Produto c1 = new Produto();
		
		c1.clientes = "João Pedro";
		c1.adicionarItens(new Item("Biscoito", 2, 4.5));
		c1.adicionarItens(new Item("Borracha", 12, 0.5));
		c1.adicionarItens(new Item("Livro", 1, 10.5));
		
		
		c1.visualizarLista();
		
		System.out.println(c1.itens.size());
		System.out.println("\nValor do produto: " + c1.obterTotal());
		
	}
}
