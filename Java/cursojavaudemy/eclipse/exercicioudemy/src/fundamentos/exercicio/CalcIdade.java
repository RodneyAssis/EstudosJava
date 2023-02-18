package fundamentos.exercicio;

import java.util.Scanner;

//1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
public class CalcIdade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o sua idade apartir do ANO/MES/DIAS:\n"
						 + "ano: ");
		Integer ano = input.nextInt();
		System.out.print("Mês: ");
		Integer mes = input.nextInt();
		System.out.print("Dias: ");
		Integer dias = input.nextInt();
		 
		int diasTotal = dias + (mes*30) + (ano*365);
		
		System.out.printf("Sua idade: %d anos, %d meses, %d dias = %d dias.", ano, mes, dias, diasTotal);
		
		input.close();
		
	}
}
