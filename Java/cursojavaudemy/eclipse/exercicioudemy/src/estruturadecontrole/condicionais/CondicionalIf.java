package estruturadecontrole.condicionais;

import java.util.Scanner;

public class CondicionalIf {
	public static void main(String[] args) {
		// Estrutura de controle - IF
		// Teclas de atalho ctrl + shift + l
		Scanner input = new Scanner(System.in);

		System.out.println("Digite as notas do aluno: ");
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();

		var media = (nota1 + nota2) / 2;

		if (media > 6.9 && media <= 10) {
			System.out.println("A media do aluno foi: " + media);
			System.out.println("Aluno Aprovado, Parabêns!!");
		}
		if (media <= 6.9 && media >= 0) {
			System.out.println("A media do aluno foi: " + media);
			System.out.println("Aluno Reprovado");
		}

		input.close();

	}
}
