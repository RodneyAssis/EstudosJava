package estruturadecontrole.condicionais;

import java.util.Scanner;
//Exercicio digita o dia da semana e digito qual o numero que representa o dia da semana 
public class DesafioSemana {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um dia da semana: ");
		String diaSemana = input.next();
		// "Valor".equals(variavel) // compara os caracteres com o objeto dentro do tipo string
		if ("domingo".equals(diaSemana)) {
			System.out.println("1º Dia da semana");
		} else if ("segunda".equals(diaSemana)) {
			System.out.println("2º Dia da semana");
		} else if ("terça".equals(diaSemana)) {
			System.out.println("3º Dia da semana");
		} else if ("quarta".equals(diaSemana)) {
			System.out.println("4º Dia da semana");
		} else if ("quinta".equals(diaSemana)) {
			System.out.println("5º Dia da semana");
		} else if ("sexta".equals(diaSemana)) {
			System.out.println("6º Dia da semana");
		} else if ("sabado".equals(diaSemana)) {
			System.out.println("7º Dia da semana");
		} else {
			System.out.println("Valor Invalido!");
		}

		input.close();
	}
}
