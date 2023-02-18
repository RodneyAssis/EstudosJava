package estruturadecontrole.exercicios;

import java.util.Scanner;

/*
3. Criar um programa que receba duas notas parciais, calcular a média final.
Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
caso contrário imprime no console "Reprovado".
 */

public class MediaAluno {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a nota da primeira unidade: ");
		double num1 = input.nextDouble();
		System.out.println("Digite a nota da segunda unidade: ");
		double num2 = input.nextDouble();

		var media = (num1 + num2) / 2;

		if (media >= 7) {
			System.out.println("Aprovado\\nNota: " + media);
		} else if (media < 7 && media >= 4) {
			System.out.println("Em Recuperação\nNota: " + media);
		} else {
			System.out.println("Reprovado/De base\nNota: " + media);
		}
		input.close();
	}
}
