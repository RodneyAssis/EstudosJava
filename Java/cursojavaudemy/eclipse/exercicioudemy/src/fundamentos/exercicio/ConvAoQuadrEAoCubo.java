package fundamentos.exercicio;

import java.util.Scanner;

//Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
public class ConvAoQuadrEAoCubo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double num1 = input.nextDouble();
		
		System.out.printf("Valor ao quadrado: %.1f\nValor ao cubo: %.1f", Math.pow(num1, 2), Math.pow(num1, 3));
		
		input.close();
	
	}
}