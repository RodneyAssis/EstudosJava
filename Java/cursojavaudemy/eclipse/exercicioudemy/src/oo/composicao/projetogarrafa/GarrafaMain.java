package oo.composicao.projetogarrafa;

import java.util.Scanner;

public class GarrafaMain {
	public static void main(String[] args) {
		Garrafa g1 = new Garrafa();
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("STATUS\nTotal de litros: " + g1.volumeMax);
			System.out.println("Litros: " + g1.volume);
			String cond_tampa = g1.t.rosqueada == false ? "sim" : "não";
			System.out.println("Tampa aberta? " + cond_tampa);
			
			System.out.println("\n1- Encher\n2- esvaziar\n3- Abrir/Fechar Tampa\nInforme uma das alternativas:");
			int opcao = input.nextInt();
			if (opcao == -1) {
				break;
			}
			switch (opcao) {
			case 1:
				if (g1.t.rosqueada == true) {
					System.out.println("Impossivel encher a Garrafa, abra a garrafa antes de encher.");
				} else {
					System.out.println("Informe o quanto deseja encher");
					double encher = input.nextDouble();
					if (encher > g1.volumeMax) {
						System.out.println("Garrafa não suporta a quantidade de agua, tente novamente.");
						break;
					}
					g1.encher(encher);
				}
				break;
			case 2:
				if (g1.t.rosqueada == true) {
					System.out.println("Impossivel esvaziar a Garrafa, abra a garrafa antes de encher.");
				} else {
					System.out.println("Informe o quanto deseja esvaziar");
					double esvaziar = input.nextDouble();
					g1.esvaziar(esvaziar);
				}
				break;
			case 3:
				if (g1.t.rosqueada == true) {
					System.out.println("Garrafa aberta.\nDeseja fechar? ");
				} else {
					System.out.println("Garrafa fechada.\nDeseja mante-la fechada? ");
				}
				boolean opcaoTampa= input.nextBoolean();
				g1.t.FecharGarrafa(opcaoTampa);
				break;
			default:
				System.out.println("Não conheço essa função, tente outra.");
				break;
			}
		}
		
		input.close();
	}
}
