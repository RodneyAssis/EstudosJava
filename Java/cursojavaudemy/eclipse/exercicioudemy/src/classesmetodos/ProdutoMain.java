package classesmetodos;

import java.util.Scanner;

public class ProdutoMain {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 0, 0.25);
		//p1.nome = "Notebook";
		p1.preco = 2500.99;
		//p1.desconto = 0.2;
		
		var p2 = new Produto("Caneta2");
		p2.nome = "Caneta";
		p2.preco = 1.99;
		//p2.desconto = 0.1;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		//double valorLiquido = p1.preco-(p1.preco*p1.desconto);
		
		//System.out.printf("Valor do produto: R$%.2f", valorLiquido);
		
		
		//desafio metodo1
		//System.out.printf("\nValor do produto: R$%.2f", p1.comDesconto());
		//System.out.printf("\nValor do produto: R$%.2f", p2.comDesconto());
		
		//Desafio Membro instancia e classe
		
		Scanner input = new Scanner(System.in);

		
		Produto p3 = new Produto();
		
		System.out.print("Valor do produto: ");
		p3.preco = input.nextDouble();
		
		System.out.println("Valor do produto: " + p3.preco
						+ "\nValor do produto com desconto: " + Produto.descontoGeral(p3.preco));
		input.close();
	}
}
