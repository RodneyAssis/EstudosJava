package fundamentos.exercicio;

import java.util.Scanner;

//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
public class Conversao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma temperatura em Fahrenheit: ");
		double valorFahr = input.nextDouble();
		
		double convFahrParaCels = ((valorFahr - 32)*5)/9;
		
		System.out.printf("Temperatura em Celsius: %.1f C", convFahrParaCels);
		
		input.close();
	}
}
