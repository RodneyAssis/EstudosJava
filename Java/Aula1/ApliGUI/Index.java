package ApliGUI;

import javax.swing.JOptionPane;

public class Index {

	public static void main(String[] args) {
		String digitea;
		
		while (true) {
			
			digitea = JOptionPane.showInputDialog("Digite duvido! ");
			if (!(digitea.equals("duvido"))) {
			JOptionPane.showMessageDialog(null, "Digite de duvido!");
		}
			else {
				JOptionPane.showMessageDialog(null, "Meu pau no teu ouvido, "
						+ "IIIIIIIIGGGGHHFGH");
				break;
			}
		}
	}
}












btcidade.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String Nome;
		String Codigo;
		String UF;
		
		Nome = JOptionPane.showInputDialog("Digite o nome da Cidade: ");
		Codigo = JOptionPane.showInputDialog("Digite o codigo da cidade: ");
		UF = JOptionPane.showInputDialog("Digite a UF da cidade: ");
	}
});
