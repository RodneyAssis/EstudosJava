package oo.composicao;

import java.util.Scanner;

public class CursoTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nomeA = "";
		String nomeC = "";
		
		Aluno a1 = new Aluno(nomeA);
		Curso c1 = new Curso(nomeC);
		
		System.out.println("Teste");
		while (true) {
			System.out.println("Informa o nome do aluno: ");
			nomeA = input.next();
			if (nomeA.equals("1")) {
				break;
			}
			
			while (!(nomeC.equals("a"))) {
				c1.addalunos(new Aluno(nomeA));
				System.out.println("Escolha uma das alternativas:"
						+ "\n1-Ciencias da Computação"
						+ "\n2-Sistema da Informação"
						+ "\n3-Jogos digitais"
						+ "\n4-Rede de Computadores"
						+ "\nInforma o curso: ");
				nomeC = input.next();
				switch (nomeC) {
				case "1":
					nomeC = "CienciasDaComputacao";
					a1.addcurso(new Curso(nomeC));
					break;
				case "2":
					nomeC = "SistemasDigitais";
					a1.addcurso(new Curso(nomeC));
					break;
				case "3":
					nomeC = "JogosDigitais";
					a1.addcurso(new Curso(nomeC));
					break;
				case "4":
					nomeC = "RedesDeComputadores";
					a1.addcurso(new Curso(nomeC));
					break;
				}
			}
		}
		
		//c1.viewalunos();
		//a1.viewcurso();
		
		for (int i = 0; i < c1.alunos.size(); i++) {
			System.out.println("Nome do aluno: " + c1.alunos.get(i) + " - Curso: " + a1.cursos.get(i).nome);
		}
		
		input.close();
	}
}
