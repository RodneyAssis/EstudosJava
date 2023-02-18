package estruturadecontrole.repeticao;

import java.util.Scanner;

public class RepeticaoFor3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Reserva acento do onibus:
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("[%02d, %02d] ",i+1,j+1);
			}
			System.out.println();
		}
		
		input.close();
	}
}
