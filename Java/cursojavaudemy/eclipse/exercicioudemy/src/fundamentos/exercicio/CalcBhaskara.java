package fundamentos.exercicio;

import java.util.Scanner;

//Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
//Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
public class CalcBhaskara {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Calculo de Bhaskara:");
		System.out.print("Ax² + Bx + C = 0\nDigite um valor para A: ");
		double a = input.nextDouble();
		System.out.printf("%.1fx² + Bx + C = 0\nDigite um valor para B: ",a);
		double b = input.nextDouble();
		System.out.printf("%.1fx² + %.1fx + C = 0\nDigite um valor para C: ",a,b);
		double c = input.nextDouble();
		
		double delta = Math.pow(b, 2) - 4*a*c;
		
		System.out.printf("%.1fx² + %.1fx + %.1f = 0\nValor de delta é igual a: %.2f", a, b, c, delta);
		
		input.close();
	
	}
}
