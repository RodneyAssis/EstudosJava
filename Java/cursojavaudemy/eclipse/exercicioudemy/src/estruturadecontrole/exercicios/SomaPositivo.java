package estruturadecontrole.exercicios;

import java.util.Scanner;

/*
7. Criar um programa que enquanto estiver recebendo números positivos,
imprime no console a soma dos números inseridos, caso receba um número negativo, encerre o programa.
Tente utilizar a estrutura do while.
 */

public class SomaPositivo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String conca = "";
		String num1;
		int somaTotal = 0;
		do {
			System.out.println("Digite um numero: ");
			num1 = input.next();
			if (Integer.parseInt(num1) < 0) {
				break;
			}
			somaTotal += Integer.parseInt(num1);
			conca += num1.concat("   ");
		} while (true);
		
		System.out.printf("Soma dos resultados: \n%s = %d", conca.replaceAll("   ", " + "), somaTotal);
		input.close();
	}
}
