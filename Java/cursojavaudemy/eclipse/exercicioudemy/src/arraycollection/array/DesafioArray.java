package arraycollection.array;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o numero de notas que deseja apresentar: ");
		int num = input.nextInt();

		double[] Notas = new double[num];

		for (int i = 0; i < Notas.length; i++) {
			System.out.print("\nInforme " + (i + 1) + "º nota: ");
			double valorNota = input.nextInt();
			Notas[i] = valorNota;
		}

		double somaNotas = 0;
		for (double d : Notas) {
			somaNotas += d;
		}

		System.out.println("Notas do aluno " + Arrays.toString(Notas) + "\nSoma das notas: " + somaNotas + "\nMedia: "
				+ somaNotas / Notas.length);
		input.close();
	}
}
