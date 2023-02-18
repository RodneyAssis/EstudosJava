package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		String nome = entrada.next();
		
		System.out.print("idade: ");
		int idade = entrada.nextByte();
		
		System.out.print("salario: ");
		float salario = entrada.nextFloat();
		
		String frase = String.format("\nSeu nome é %s\npossui %d anos\ne recebe aproximadamente R$%.2f, correto?", nome, idade, salario);
		
		System.out.println(frase);
		
		entrada.close();
		
	}
}
