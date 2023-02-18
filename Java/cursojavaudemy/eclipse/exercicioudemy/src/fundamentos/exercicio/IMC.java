package fundamentos.exercicio;

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		double peso = input.nextDouble();
		System.out.print("Digite a altura: ");
		double altura = input.nextDouble();
		
		double imc = peso/(Math.pow(altura, 2));
		
		String resultado = imc < 16 ? "Magreza grave" : 
						   16 <= imc && imc < 17 ? "Magreza moderada" : 
						   17 <= imc && imc < 18.5 ? "Magreza leve" :
						   18.5 <= imc && imc < 25 ? "Saudavel" :
						   25 <= imc && imc < 30 ? "Sobrepeso" : 
						   30 <= imc && imc < 35 ? "Obesidade" :
						   35 <= imc && imc < 40 ? "Obesidade II" :
						   imc > 40 ? "Obesidade III" : "0";
						   
		System.out.printf("Valor do IMC %.1f Resultado: %s", imc, resultado);
		
		
		input.close();
	}
}
