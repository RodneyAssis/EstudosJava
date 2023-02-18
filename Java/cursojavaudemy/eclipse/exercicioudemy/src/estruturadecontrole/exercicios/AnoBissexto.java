package estruturadecontrole.exercicios;

import java.util.Scanner;

// 2. Criar um programa informa se o ano atual é um ano bissexto;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int ano = input.nextInt();

		if (ano % 6 == 0) {
			System.out.println("Estamos em ano bissexto: " + ano);
		} else {
			System.out.println("Estamo no ano: " + ano);
		}
		input.close();
	}
}
