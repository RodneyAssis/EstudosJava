package oo.composicao.desafiomeu;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	List<Compra> compralist = new ArrayList<>();

	String nome;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String nomeCl, List<Compra> lc) {
		this.nome = nomeCl;
		this.compralist = lc;
	}
	
	void adicionarCompra(Compra c) {
		this.compralist.add(c);
	}
	
	void mostrarCompras() {
		for (Compra cr : compralist) {
			for (int i = 0; i < cr.it.size(); i++) {				
				System.out.println(cr.it.get(i).nome);
				System.out.println(cr.it.get(i).preco);
				System.out.println(cr.it.get(i).qtd);

			}
		}
	}

}