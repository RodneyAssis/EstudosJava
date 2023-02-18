package fundamentos.exercicio;

import java.util.Scanner;

//Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
//antecessor e seu sucessor.
public class ValorSucessorEAntecessor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double num = input.nextDouble();
		
		System.out.printf("Valor sucessor %.1f, valor antecessor %.1f de %.1f", num+1, num-1, num);
		
		input.close();
	}
}
