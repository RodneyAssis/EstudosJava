package fundamentos.operacoeslogicas;

import java.util.Scanner;

public class DesafioOperadoresLogicos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 Trabalho na terça (V ou F)
		Trabalho na quinta (V ou F)

		se v v >> comprar tv de 50pol
		se f v ou v f >> comprar tv de 32pol
		se comprar tv de 32 ou 55 >> irá tomar sorvete

		se f f >> familia vai ficar em casa
		 */
		System.out.print("Conseguiu o trabalho de terça?");
		Boolean trabalho1 = Boolean.parseBoolean(input.next());
		System.out.print("Conseguiu o trabalho de quinta?");
		Boolean trabalho2 = Boolean.parseBoolean(input.next());
		
		System.out.println("Vamos comprar a tv de 55'? " + (trabalho1 && trabalho2));
		System.out.println("Vamos comprar a tv de 32'? " + (trabalho1 ^ trabalho2));
		System.out.println("Iremos tomar sorvere? " + (trabalho1 || trabalho2));
		System.out.println("Hoje iremos ficar em casa? " + !(trabalho1 || trabalho2));
		
		
		input.close();
	}
}
