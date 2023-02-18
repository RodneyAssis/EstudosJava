package classesmetodos.desafiomodulo;

import java.util.Scanner;

public class JantarMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa("paulo", 60);
		Comida c1 = new Comida();
		
		double aliConsumidos = 0.0;
		String nomesAlimentos = "";

		while (true) {
			System.out.println("Hora do Jantar!!\nMe diga o que deseja comer: ");
			c1.nome = input.next();
			if (c1.nome.equals("estoucheio")) {
				break;
			}
			nomesAlimentos += c1.nome.concat(" ");
			
			System.out.println("Diga o peso: ");
			c1.peso = input.nextDouble();
			
			aliConsumidos += c1.peso;
			p1.peso += c1.peso;
		}
		
		System.out.println(p1.visualizar());
		System.out.println("Aumento de peso " + aliConsumidos + "Kg");
		System.out.println("Alimentos consumidos " + nomesAlimentos);
		
		input.close();
	}


}
