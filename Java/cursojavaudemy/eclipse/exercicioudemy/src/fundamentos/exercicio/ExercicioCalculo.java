package fundamentos.exercicio;

import java.util.Scanner;

/*
4. Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */
public class ExercicioCalculo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor porcentual do IPI das peças: ");
		double acrescimoIpi = input.nextDouble();
		System.out.print("Digite o codigo da peça1: ");
		String codigoPeca1 = input.next();
		System.out.print("Digite o valor unitario: ");
		double valorUnitarioPeca1 = input.nextDouble();
		System.out.print("Digite a quantidade: ");
		double qtdPeca1 = input.nextDouble();
		
		System.out.print("Digite o codigo da peça2: ");
		String codigoPeca2 = input.next();
		System.out.print("Digite o valor unitario: ");
		double valorUnitarioPeca2 = input.nextDouble();
		System.out.print("Digite a quantidade: ");
		double qtdPeca2 = input.nextDouble();
		
		double valorTotal = ((valorUnitarioPeca1*qtdPeca1) + (valorUnitarioPeca2*qtdPeca2))*((acrescimoIpi/100)+1);
		
		System.out.printf("Codigo da peça1: %s Valor por unidade: R$%.2f Quantidade de peças: %.0f\n"
				+ "Codigo da peça2: %s Valor por unidade: R$%.2f Quantidade de peças: %.0f"
				+ "\nValor total a ser pago pelas peças: R$%.2f"
				,codigoPeca1, valorUnitarioPeca1, qtdPeca1, codigoPeca2, valorUnitarioPeca2, qtdPeca2, valorTotal);
		
		input.close();
		
		
	}
}
