package estruturadecontrole.repeticao;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double nota = 0;
		double notaTotal = 0;
		int cont = 0;
		while (nota != -1) {

			System.out.print("Olá aluno(a)!\nPor favor digite sua nota aqui: ");
			nota = input.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaTotal += nota;
				cont++;
			} else if(nota == -1){
				System.out.println();
			} else {
				System.out.println("Nota invalida!");
			}
		}

		double media = notaTotal / cont;

		System.out.printf("Total de alunos: %d" + "\nMedia da nota total dos alunos: %.2f", cont, media);

		input.close();
	}
}
