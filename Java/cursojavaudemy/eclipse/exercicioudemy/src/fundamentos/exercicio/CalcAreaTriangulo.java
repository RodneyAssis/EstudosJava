package fundamentos.exercicio;

import java.util.Scanner;

//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
public class CalcAreaTriangulo {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Calculo da area de um triangulo:");
		 System.out.print("Digite o valor da base: ");
		 double b = input.nextDouble();
		 System.out.print("Digite o valor da altura: ");
		 double h = input.nextDouble();

		 double valorArea = (b*h)/2;
				 
		 System.out.printf("Área do triangulo é de %.1fm", valorArea);
		 
		 input.close();
	}
}
