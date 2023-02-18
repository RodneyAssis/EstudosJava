package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	final String nome;
	final List<Aluno> alunos = new ArrayList<>(); 
	// lista constante lista adicionada a memoria e esta apontando ao um endereco de memoria e não pode ser alterado
	
	public Curso(String nome) {
		this.nome = nome;
	}

	void addalunos(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);

	}
	
	void viewalunos() {
		int cont = 1;
		for (Aluno al : alunos) {
			System.out.println(cont + " aluno: " + al.nome);
			cont++;
		}
	}
}
