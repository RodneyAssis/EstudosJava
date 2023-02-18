package fundamentos.exercicio;

import java.util.Scanner;

/*
2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
   Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres.
 */
public class ColetaDadosSexo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int qtdMulheres = 0;
		int qtdPessoas = 10;
		
		String maiorAlturaSexo = null;
		String menorAlturaSexo = null;
		double maiorAltura = 0;
		double menorAltura = 99999;
		double totalAlturaHomens = 0;
		

		for (int i = 0; i < qtdPessoas; i++) {
			System.out.printf("%d pessoa:", i + 1);
			
			System.out.println("\nInforme a altura: ");
			double altura = input.nextDouble();
			
			System.out.println("1-Homens | 2-Mulheres\nInforme o sexo: ");
			String sexo = input.next();
			
			if (!(sexo.equalsIgnoreCase("1") || sexo.equalsIgnoreCase("2"))) {
				System.out.println("Informação incorreta!");
				i -= 1;
				continue;
			} 
			
			if (sexo.equalsIgnoreCase("1")) {
				sexo = "Masculino";
				totalAlturaHomens += altura;
			} else {
				sexo = "Feminino";
				qtdMulheres++;
			}
			
			if (maiorAltura < altura) {
				maiorAltura = altura;
				maiorAlturaSexo = sexo;
			}
			if (menorAltura >= altura) {
				menorAltura = altura;
				menorAlturaSexo = sexo;
			}
		}
		
		// a. a maior e a menor altura do grupo;
		System.out.printf("\n\nMaior altura e do sexo %s com %.2fm", maiorAlturaSexo, maiorAltura);
		System.out.printf("\nMenor altura e do sexo %s com %.2fm", menorAlturaSexo, menorAltura);
		
		// b. média de altura dos homens;
		System.out.println("\nMedia de altura dos homens: " + (totalAlturaHomens/(qtdPessoas - qtdMulheres)));
		
		// c. o número de mulheres.
		System.out.println("Numero de mulheres: " + qtdMulheres);
		
		input.close();
	}
}
