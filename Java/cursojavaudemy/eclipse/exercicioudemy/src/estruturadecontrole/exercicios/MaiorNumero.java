package estruturadecontrole.exercicios;

import java.util.Scanner;
// Crie um programa que recebe 10 valores e ao final imprima o maior número.
public class MaiorNumero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		int num, cont = 0;
		var maiorNumero = 0;
		while (cont < 10) {
			System.out.println("Digite um numero: ");
			num = input.nextInt();
			
			if (maiorNumero < num) {
				maiorNumero = num;
			} 
			
			cont++;
		}
		System.out.println("maior numero: " + maiorNumero);
		input.close();
	}
}
