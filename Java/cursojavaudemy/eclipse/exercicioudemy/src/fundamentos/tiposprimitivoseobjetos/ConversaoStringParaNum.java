package fundamentos.tiposprimitivoseobjetos;

import javax.swing.JOptionPane;

public class ConversaoStringParaNum {
	public static void main(String[] args) {
		//conversão de string para numero
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo valor numero");
		
		
		System.out.println(valor1 + valor2);
		
		Double num1 = Double.parseDouble(valor1);
		Double num2 = Double.parseDouble(valor2);
		
		var soma = num1 + num2;
		
		System.out.println("Soma é: " + soma);
		System.out.println("A media é: " + soma/2);

	}
}
