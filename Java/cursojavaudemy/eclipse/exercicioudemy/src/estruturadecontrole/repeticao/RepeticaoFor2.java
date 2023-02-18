package estruturadecontrole.repeticao;

import java.util.Scanner;

public class RepeticaoFor2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			// For decrescente
			// armazenamento for em uma variavel
			String armazenarNome = "";
			for (int i = 10; i > 0; i--) {
				System.out.println("Num de usuarios disponiveis: " + i);
				System.out.print("Digite um nome ");
				String nome = input.next();
				
				armazenarNome = armazenarNome + (nome.concat(" ")); 
			}
			
			System.out.println("Nomes Armazenados: \n" + armazenarNome.replace(" ", "\n"));
		input.close();
	}
}
