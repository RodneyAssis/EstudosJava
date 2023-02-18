package estruturadecontrole.repeticao;

import java.util.Scanner;

public class RepeticaoDoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String valorSaida;
		do {
			System.out.println("Digite 1 para sair: ");
			valorSaida = input.next();
		} while (!("1".equalsIgnoreCase(valorSaida)));
		
		System.out.println("Parabêns você saiu!!");
		input.close();
	}
}
