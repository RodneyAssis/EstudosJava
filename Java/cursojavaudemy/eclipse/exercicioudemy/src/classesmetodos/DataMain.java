package classesmetodos;

import java.util.Scanner;

public class DataMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		/*
		Data d1 = new Data(01,01,1997);
		Desafio Metodo
		String dataTotal = "";
		
		while (true) {
			System.out.print("Digite um dia: ");
			d1.dia = input.nextInt();
			if (d1.dia == -1) {
				break;
			}
			System.out.print("Digite um mes: ");
			d1.mes = input.nextInt();
			System.out.print("Digite um ano: ");
			d1.ano = input.nextInt();
			
			dataTotal += d1.obterDataFormtada();
			
			
		}
		
		System.out.println(dataTotal);
		 */
		
		Data d2 = new Data();
		//Desafio Construtor
		int test;
		while (true) {
			System.out.println("\nPara pular digite '-1'\nDigite o dia: ");
			test = input.nextInt();
			if (test != -1) {
				d2.dia = test;
			}
			System.out.println("Digite o mes: ");
			test = input.nextInt();
			if (test != -1) {
				d2.mes = test;
			}
			System.out.println("Digite o ano: ");
			test = input.nextInt();
			if (test != -1) {
				d2.ano = test;
			}
			break;
		}
		
		System.out.println(d2.obterDataFormtada());
		
		input.close();
	}
}
