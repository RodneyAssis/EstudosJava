package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	void addcurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	void viewcurso() {
		for (Curso cu : cursos) {
			System.out.println("curso: " + cu.nome);
		}
	}
	
	public String toString() {
		return nome;
	}
	
	Curso obCursoporNome(String nome) {
		Curso procurado = null;
		for (Curso curso : cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return procurado;
	}
}
