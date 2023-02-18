package fundamentos.tiposprimitivoseobjetos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Locale.of("pt", "BR");
		Locale aLocale = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
		Locale.setDefault(aLocale);
		
		System.out.println(Locale.getDefault());
		System.out.print("Digite o valor do seu salario deste mês: ");
		String sal1 = input.next();
		System.out.print("Digite o valor do seu salario do mês passado: ");
		String sal2 = input.next();
		System.out.print("Digite o valor do seu salario do mês re-trasado: ");
		String sal3 = input.next();
		
		
		
		Double num1 = Double.parseDouble(sal1.replace(",", "."));
		Double num2 = Double.parseDouble(sal2.replace(",", "."));
		Double num3 = Double.parseDouble(sal3.replace(",", "."));

		var soma = num1 + num2 + num3;
		
		System.out.println("Valor total do salario: " + soma);
		System.out.println("A média salarial é de R$" + soma/3);
		
		input.close();
	}
}
