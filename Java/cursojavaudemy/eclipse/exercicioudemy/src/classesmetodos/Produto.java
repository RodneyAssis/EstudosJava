 package classesmetodos;

public class Produto {
	String nome;
	
	double preco;
	//double desconto;
	
	//Desafio membro instancia e classe;
	static double desconto = 0.25;
	static double descontoGeral(double preco) {
		return preco-(preco*(desconto));
	}
	
	//desafio construtor
	//Construtor Explicito
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial,
			double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		//desconto = descontoInicial;
	}
	
	//Construtor padrão
	Produto() {
		
	}
	
	//desafio metodo1
	double comDesconto() {
		return preco-(preco*desconto);
	}
	double comDescontoDoGerente(double descontoG) {
		return preco-(preco*(desconto + descontoG));
	}
}
