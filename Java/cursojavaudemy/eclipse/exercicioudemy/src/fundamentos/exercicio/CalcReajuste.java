package fundamentos.exercicio;

import java.util.Scanner;

//Informar um saldo e imprimir o saldo com reajuste de 1%.
public class CalcReajuste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Reajuste Salarial: ");
		System.out.print("Digite o valor do seu saldo: ");
		double saldo = input.nextDouble();
		
		double saldoReajustado = (saldo*1.01);
	
		System.out.printf("Valor do saldo: R$%.2f\nValor do saldo pós reajuste: R$%.2f", saldo, saldoReajustado);
		input.close();
	}
}
