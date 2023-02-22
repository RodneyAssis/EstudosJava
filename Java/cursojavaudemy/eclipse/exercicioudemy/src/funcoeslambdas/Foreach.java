package funcoeslambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("joao1", "joao2", "joao3", "joao4");

		System.out.println("NOME DOS APROVADOS Utilizando forma tradicional");
		for (String nomes : aprovados) {
			System.out.println("nomes: " + nomes);
		}
		
		//for each = para cada aprovados faça imprimir o nome
		System.out.println("NOME DOS APROVADOS UTILIZANDO LAMBDA #01");
		aprovados.forEach(nome -> {System.out.println("Nome: " + nome);});
		
		// pra cada X aplicar o sysout que VISÃO!!!!!!
		System.out.println("Method Reference...");
		System.out.println(aprovados.forEach(System.out::println));
		
		System.out.println("Lambda #2...");
		//Continuação de ForEach parte 2
		aprovados.forEach(nome -> imprimir(nome));

	
		// pra cada X aplicar o sysout que VISÃO!!!!!!
		System.out.println("Method Reference #2...");
		aprovados.forEach(Foreach::imprimir);
	}
	
	static void imprimir(String nome) {
		System.out.println("Nome: " + nome);
	}
}
