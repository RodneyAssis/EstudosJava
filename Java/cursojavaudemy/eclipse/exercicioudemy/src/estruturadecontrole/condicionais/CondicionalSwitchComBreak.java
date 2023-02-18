package estruturadecontrole.condicionais;

import java.util.Scanner;

public class CondicionalSwitchComBreak {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int conceito = 0;

		System.out.println("Informar nota: ");
		conceito = input.nextInt();

		switch (conceito) {
		case 10:
		case 9:
			System.out.println("Parabens!! você foram classificados na categoria A.");
			break;

		case 8:
		case 7: {
			System.out.println("Boa pontuação você arrasou!!\n está na categoria B.");
		}
		
		case 6: case 5:
			System.out.println("Não foi desta vez...");
		default:
			System.out.println("Resultado Invalido");
		}

		input.close();
	}
}
