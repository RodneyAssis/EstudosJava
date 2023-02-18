package fundamentos.exercicio;

import java.util.Scanner;

//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
public class Conversao2 {
	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.print("Digite uma temperatura em Fahrenheit: ");
		double valorCels = input.nextDouble();
		
		double convCelsParaFahr = (valorCels * 9/5) + 32;
		
		System.out.printf("Temperatura em Celsius: %.1f C", convCelsParaFahr);
		
		input.close();
	}
}
