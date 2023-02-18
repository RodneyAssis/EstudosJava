package estruturadecontrole.condicionais;

import javax.swing.JOptionPane;

public class CondicionalElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe um numero: ");
		int num = Integer.parseInt(valor);

		if (num % 2 == 0) {
			System.out.println("Valor par.");
		} else {
			System.out.println("Valor Impar.");
		}

	}
}
