package oo.composicao.desafiomeu;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> it = new ArrayList<>();
	
	public Compra() {
		
	}
	
	public Compra(List<Item> item) {
		 this.it = item;
	}
	
	public 
	
	void adicionarItem(String nomePD, double precoPD, int qtd) {
		this.it.add(new Item(nomePD, precoPD, qtd));
	}

}
