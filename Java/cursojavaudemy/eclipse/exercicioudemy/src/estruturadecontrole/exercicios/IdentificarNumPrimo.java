package estruturadecontrole.exercicios;

import java.util.Scanner;

//Criar um programa que receba um número e diga se ele é um número primo.

public class IdentificarNumPrimo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		Integer num = input.nextInt();
		int cont = 0;
		for (int i = num; i > 0; i--) {
			if (num % i == 0 && num % 1 == 0) {
				cont++;
			}
		}
		
		if (cont == 2) {
			System.out.printf("O número %d é primo", num);
		} else {
			System.out.printf("O número %d não é primo", num);
		}
		
		input.close();
	}
}
