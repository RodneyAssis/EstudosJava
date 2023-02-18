package estruturadecontrole.repeticao;

import java.util.Scanner;

public class exWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String quebraRepeticao = "";
		
		while (!("sair".equalsIgnoreCase(quebraRepeticao))) {
			System.out.println("\nDigite algo: ");
			quebraRepeticao = input.next();
		}
		
		System.out.println("Tu saiu");
		input.close();
	}
}
