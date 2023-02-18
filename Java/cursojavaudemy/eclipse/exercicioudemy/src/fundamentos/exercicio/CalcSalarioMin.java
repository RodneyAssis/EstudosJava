package fundamentos.exercicio;

import java.util.Scanner;

/*
5. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
 */
public class CalcSalarioMin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double valorSalarioMin = 788;
		
		System.out.print("Digite o valor do seu salario: ");
		double saldoSalarial = input.nextDouble();
		
		System.out.printf("Seu salaria de R$%.2f equivale a %.1f Salario Minimo", saldoSalarial, (saldoSalarial/valorSalarioMin));
		
		input.close();
	}
}
