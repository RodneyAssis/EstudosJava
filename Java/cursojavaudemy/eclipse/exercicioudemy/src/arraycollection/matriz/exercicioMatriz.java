package arraycollection.matriz;

import java.util.Arrays;
import java.util.Scanner;

public class exercicioMatriz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe o numeros de alunos: ");
		int numAlunos = input.nextInt();
		System.out.print("Informe o numeros de notas: ");
		int numNotas = input.nextInt();

		String[][] bancoAlunos = new String[numAlunos][numNotas + 1];

		double somaTotal = 0;
		for (int i = 0; i < bancoAlunos.length; i++) {
			System.out.print("Informe o nome do " + (i + 1) + " aluno: ");
			String nomeAluno = input.next();
			bancoAlunos[i][0] = nomeAluno;
			for (int j = 1; j < bancoAlunos[i].length; j++) {
				System.out.print("Informe a nota: ");
				Double notaAluno = input.nextDouble();

				somaTotal += notaAluno;
				bancoAlunos[i][j] = Double.toString(notaAluno);
			}
		}

		System.out.println("\nNOME/NOTA DOS ALUNOS: ");
		for (int i = 0; i < numAlunos; i++) {
			System.out.print("Nome: " + bancoAlunos[i][0] + "  ");
			for (int j = 1; j < bancoAlunos[i].length; j++) {
				System.out.printf("Nota %d: | %s |", j, bancoAlunos[i][j]);
			}
			System.out.println();
		}

		double media = somaTotal / (numAlunos * numNotas);
		System.out.println("\nMedia dos alunos " + media);
	
		// Segue e a dica
		
		for (String[] bA : bancoAlunos) {
			System.out.println(Arrays.toString(bA));
		}

		input.close();
	}
}
