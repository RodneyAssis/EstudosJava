package estruturadecontrole.exercicios;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int numAleatorio = random.nextInt(100);
		System.out.println(numAleatorio);
		int cont = 10;
		while (cont != 0) {
			System.out.println("Digite um numero aleatorio: ");
			int num1 = input.nextInt();

			if (num1 >= 0 && num1 <= 100) {
				if (num1 == numAleatorio) {
					System.out.println("Parabens! você acertou");
				} else if (((numAleatorio - 10) < num1) && (num1 < (numAleatorio + 10))) {
					cont--;
					System.out.println("Está quente!!!");
					System.out.println("Você ainda tem: " + cont + "tentativas");

				} else {
					cont--;
					System.out.println("Nops");
					System.out.println("Você ainda tem: " + cont + "tentativas");

				}
			} else {
				System.out.println("Numero Invalido");
			}
		}
		input.close();
	}
}
