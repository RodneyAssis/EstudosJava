package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ler num1
		//ler num2
		// pedir o operador + - * / %
		System.out.print("Digite um número: ");
		Double num1 = input.nextDouble();
		System.out.print("Digite outro numero: ");
		Double num2 =  input.nextDouble();
		
	
		System.out.print("Operadores disponiveis: + - * / %\n"
				+ "Digite digite qual operador deseja utilizar: ");
		String operador = input.next();
		
		double opFinal = "+".equals(operador) ? num1 + num2 : 
						 "-".equals(operador) ? num1 - num2 : 
					     "*".equals(operador) ? num1 * num2 :
					     "/".equals(operador) ? num1 / num2 :
					     "%".equals(operador) ? num1 % num2 : 0;
		
		
		String resultado = num1.toString() + " " + operador + " " + num2.toString();
		
		
		System.out.printf("O resultado de %s = %.2f", resultado, opFinal);
		//falta converter o operador aritmetico de string para reconhecer em numeral
		//String valorFinal = operador.replace(0, 0);

		
		
		
		//System.out.print("O resultado é " + resultado + "= ");
		
		input.close();
	
	}
}
