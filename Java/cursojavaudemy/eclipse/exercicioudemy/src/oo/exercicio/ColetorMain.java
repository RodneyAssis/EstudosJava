package oo.exercicio;

import java.util.Scanner;

/*
2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
   Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */

public class ColetorMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nomePessoa = "";
		String sexoPessoa = "";
		double alturaPessoa = 0.0;
		
		
		Homem p1 = new Homem(nomePessoa, alturaPessoa, sexoPessoa);
		
		for (int i = 0; i < 2; i++) {
			System.out.print("Digite o nome do usuario: ");
			nomePessoa = input.next();
			System.out.print("1 - Maculino | 2 - Feminino\nInforme o Sexo: ");
			sexoPessoa = input.next();

			if (sexoPessoa.equals("1")) {
				sexoPessoa = "Masculino";
			} else {
				sexoPessoa = "Feminino";
			}
			
			System.out.println("Digite sua altura: ");
			alturaPessoa = input.nextDouble();
			
			p1.adicionarListaHomem(nomePessoa, alturaPessoa);
		}
		
		p1.viewLista();
		
		input.close();
		
	}
}
