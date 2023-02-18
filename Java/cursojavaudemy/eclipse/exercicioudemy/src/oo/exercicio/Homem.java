package oo.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Homem extends Pessoa{
	final String Sexo = "Masculino";
	List<Homem> listaHomens = new ArrayList<>();
	public Homem() {
		// TODO Auto-generated constructor stub
	}
	
	public Homem(String nome, double altura, String sexo) {
		super.altura = altura;
		super.nome = nome;
	}
	
	void adicionarListaHomem(String nome, double altura) {
		this.listaHomens.add(new Homem(nome, altura, Sexo));
	}
	
	void viewLista() {
		for (int i = 0; i < listaHomens.size(); i++) {

			System.out.printf("Nome: %s\nAltura: %.2f \n", this.listaHomens.get(i).nome, this.listaHomens.get(i).altura);
//			System.out.printf("Nome: %s\nSexo %s\nAltura: %.2f", this.listaHomens.get(i).altura);
//			System.out.printf("Nome: %s\nSexo %s\nAltura: %.2f", this.listaHomens.get(i).Sexo);
		}
	}
}
