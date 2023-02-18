package oo.composicao.desafiomeu;

import java.util.ArrayList;
import java.util.List;

public class Relatorio{
	
	List<Cliente> relatorio = new ArrayList<>();
	
	public Relatorio() {
	}

	void adicionarRelatorio(Cliente cl) {
		
		this.relatorio.add(cl);
	}
	
	void mostrarRelatorio() {
		for (int i = 0; i < relatorio.size(); i++) {
			System.out.println(relatorio.get(i));
		}
	}

}

