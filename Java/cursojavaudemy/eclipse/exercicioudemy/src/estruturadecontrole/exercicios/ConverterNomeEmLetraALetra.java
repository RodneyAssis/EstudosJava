package estruturadecontrole.exercicios;

import java.util.Scanner;

// Criar um programa que receba uma palavra e imprime no console letra por letra.
public class ConverterNomeEmLetraALetra {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um nome: ");
		String valor = input.next();
		
		System.out.println(valor.replace("", " "));
		input.close();
	}
}
