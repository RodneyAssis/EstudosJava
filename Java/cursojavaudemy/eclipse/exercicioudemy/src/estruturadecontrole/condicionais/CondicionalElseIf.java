package estruturadecontrole.condicionais;

import java.util.Scanner;

public class CondicionalElseIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite uma nota: ");
		double nota = input.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("Nota invalida");
		} else if (nota > 8 && nota <= 10) {
			System.out.println("Categoria Rank: A");
		} else if (nota >= 7.9) {
			System.out.println("Categoria Rank: B");
		} else if (nota >= 5) {
			System.out.println("Categoria Rank: C");
		} else if (nota >= 3) {
			System.out.println("Categoria Rank: D");
		} else if (nota >= 0) {
			System.out.println("Categoria Rank: F");
		}
		
		input.close();
	}
}
