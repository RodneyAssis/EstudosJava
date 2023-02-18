package estruturadecontrole.exercicios;

import java.util.Scanner;

/*
1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 */

public class Exercicios {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um numero entre 0 a 10 e que seja par: ");
		int num1 = input.nextInt();

		if ((num1 <= 10 && 0 < num1) && num1 % 2 == 0) {
			System.out.println("Numero valido!\nRespeitou todas as condições: " + num1);
		}
		input.close();
	}
}
