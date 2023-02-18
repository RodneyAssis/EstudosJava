package fundamentos.exercicio;

import java.util.Scanner;

//Fazer um programa que imprima a média aritmética dos números 8,9 e 7. 
//A média dos números 4, 5 e 6. A soma das duas médias.
//A média das médias.
public class MediaDaMedia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculando a media de duas medias: ");
		
		System.out.print("Digite o primeiro numero: ");
		double num1 = input.nextDouble();
		System.out.print("Digite o segundo numero: ");
		double num2 = input.nextDouble();
		System.out.print("Digite o terceiro numero: ");
		double num3 = input.nextDouble();
		
		double media1 = (num1+num2+num3)/3;
		
		System.out.print("Digite o quarto numero: ");
		double num4 = input.nextDouble();
		System.out.print("Digite o quinto numero: ");
		double num5 = input.nextDouble();
		System.out.print("Digite o sexto numero: ");
		double num6 = input.nextDouble();
		
		double media2 = (num4+num5+num6)/3;
		
		double mediaDasMedias = (media1 + media2)/2;
		
		System.out.printf("Primeira media: %.2f\nSegunda media: %.2f\nMedia das medias: %.2f", media1, media2, mediaDasMedias);
		
		
		
		input.close();
	}
}
