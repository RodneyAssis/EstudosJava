package pacote;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;

public class enter extends JFrame {

	private JButton Cadastro_Entrevistados;
	private JButton Cadastro_Perguntas;
	private JButton Consulta_Entrevistados;
	private JButton Consulta_Perguntas;
	private JButton Registro_Entrevistas;
	ArrayList<cad_ent> entrevistados = new ArrayList<>();
	ArrayList<cad_perg> perguntas = new ArrayList<>();
	ArrayList<cad_perg> reg_perguntas = new ArrayList<>();

	public enter() {
		this.setTitle("Questão 1");
		setBounds(100, 300, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		Cadastro_Entrevistados = new JButton();
		Cadastro_Entrevistados.setText("Cadastro de Entrevistados");
		Cadastro_Entrevistados.setBounds(1, 200, 200, 100);
		this.add(Cadastro_Entrevistados);

		Cadastro_Entrevistados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String entrevistado;
				String rua;
				cad_ent Cad_Entrevistado = new cad_ent();
				entrevistado = JOptionPane.showInputDialog("Digite o nome do entrevistado");
				Cad_Entrevistado.setNome(entrevistado);
				rua = JOptionPane.showInputDialog("Digite a rua onde mora");
				Cad_Entrevistado.setRua(rua);
				JOptionPane.showMessageDialog(null, "Cadastro de entrevistado concluido!");
				entrevistados.add(Cad_Entrevistado);
			}
		});

		Cadastro_Perguntas = new JButton();
		Cadastro_Perguntas.setText("Cadastro de Perguntas");
		Cadastro_Perguntas.setBounds(1, 20, 200, 100);
		this.add(Cadastro_Perguntas);

		Cadastro_Perguntas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String id;
				String desc;
				cad_perg Cad_Pergunta = new cad_perg();
				id = JOptionPane.showInputDialog("Digite o ID da pergunta");
				Cad_Pergunta.setId(Integer.parseInt(id));
				desc = JOptionPane.showInputDialog("Digite a descrição da pergunta");
				Cad_Pergunta.setDescricao(desc);
				JOptionPane.showMessageDialog(null, "Cadastro de perguntas concluido!");
				perguntas.add(Cad_Pergunta);
			}
		});
		Consulta_Entrevistados = new JButton();
		Consulta_Entrevistados.setText("Consulta de Entrevistados");
		Consulta_Entrevistados.setBounds(1, 400, 200, 100);
		this.add(Consulta_Entrevistados);

		Consulta_Entrevistados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				for (cad_ent cad_entrev : entrevistados) {
					String save = "Nome: " + cad_entrev.getNome() + "\nRua: " + cad_entrev.getRua();
					JOptionPane.showMessageDialog(null, save, " Consulta de Entrevistados ", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		Consulta_Perguntas = new JButton();
		Consulta_Perguntas.setText("Consulta de Perguntas");
		Consulta_Perguntas.setBounds(400, 400, 200, 100);
		this.add(Consulta_Perguntas);

		Consulta_Perguntas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				for (cad_perg cad_pergunta : perguntas) {
					JOptionPane.showMessageDialog(null, cad_pergunta.getDescricao(), " Perguntas ",
							JOptionPane.PLAIN_MESSAGE);
				}
			}
		});
		Registro_Entrevistas = new JButton();
		Registro_Entrevistas.setText("Registro da Entrevista");
		Registro_Entrevistas.setBounds(400, 200, 200, 100);
		this.add(Registro_Entrevistas);
		Registro_Entrevistas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String entrevistado;
				String pergunta;
				String datas;
				cad_ent Reg_Entrevistado = new cad_ent();
				entrevistado = JOptionPane.showInputDialog("Digite o nome do entrevistado");
				Reg_Entrevistado.setNome(entrevistado);
				datas = JOptionPane.showInputDialog("Digite a data da entrevista");
				Reg_Entrevistado.setData(Integer.parseInt(datas));
				for (cad_perg reg_ent : perguntas) {
					pergunta = JOptionPane.showInputDialog(reg_ent.getDescricao());	
					Reg_Entrevistado.setReposta(pergunta);
					reg_perguntas.add(reg_ent);
				}
				reg_perguntas.add((cad_perg) Reg_Entrevistado);
			}
		});
		Registro_Entrevistas = new JButton();
		Registro_Entrevistas.setText("Relatório de Entrevistas");
		Registro_Entrevistas.setBounds(400, 20, 200, 100);
		this.add(Registro_Entrevistas);
		Registro_Entrevistas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String datas;
				cad_ent Relat_Entrevistado = new cad_ent();
				datas = JOptionPane.showInputDialog("Digite a data da entrevista");
				Relat_Entrevistado.setData(Integer.parseInt(datas));
				for(cad_perg rel_ent : reg_perguntas) {
					String save2 = "Descrição: " + rel_ent.getDescricao() + " \nResposta: " + rel_ent.getReposta();
					JOptionPane.showMessageDialog(null, save2, " Relatório de Entrevistas ", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});		
	}
}
