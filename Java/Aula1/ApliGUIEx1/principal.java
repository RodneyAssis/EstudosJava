package ApliGUIEx1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class principal extends JFrame {

	private JButton btcidade;
	private JButton btpessoa;
	
	public principal () {
	this.setTitle("Cidade");
		setBounds(500,200,400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);;
		
		
		btcidade = new JButton();
		btcidade.setText("Cidade");
		btcidade.setBounds(0,100,100,50);
		this.add(btcidade);
		
		btpessoa = new JButton();
		btpessoa.setText("Pessoa");
		btpessoa.setBounds(100,100,100,50);
		this.add(btpessoa);

	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
	 	JFrame exemplo = new principal();
	 	exemplo.setVisible(true);
	}
}




