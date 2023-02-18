package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	List<Compra> compra = new ArrayList<>();
	
	public Cliente() {
	}
	
	void adicionarCompra(Compra compras) {
		this.compra.add(compras);
	}
	
	double obterValorMaisQueTotal() {
		double totalMax = 0;
		for (Compra c : compra) {
			totalMax += c.obterTotal();
		}
		
		return totalMax;
	}
}
