package classesmetodos.desafiomodulo;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	Pessoa() {
	}
	
	double comer(double pesoComida) {
		return peso += pesoComida;
	}
	
	String visualizar() {
		return String.format("Nome: %s\nPeso: %.2f", this.nome, this.peso);
	}
	
}
