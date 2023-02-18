package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nome = "Gegeo";
		Compra compra1 = new Compra();
		compra1.adicionarItem1("Biscoito", 1.20, 2);
		compra1.adicionarItem1("Lagostinha", 100.2, 1);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem1("Farinha", 10, 2);
		compra2.adicionarItem1("Lagostinha", 50, 1);
		
		cliente1.adicionarCompra(compra1);
		cliente1.adicionarCompra(compra2);
		
		System.out.println(compra1.obterTotal());
		System.out.println(compra2.obterTotal());
		
		System.out.println(cliente1.obterValorMaisQueTotal());
	
	}
}
