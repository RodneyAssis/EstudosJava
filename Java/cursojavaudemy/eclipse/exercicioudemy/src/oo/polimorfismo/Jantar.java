package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.9);

		// Aplicação de polimorfismo dinamico
		Ingredientes ingFeijao = new Feijao(0.24);
		Ingredientes ingArroz = new Arroz(0.14);
		Ingredientes sobremesa = new Sorvete(0.24);
		
		//implementação de abstração

		System.out.println(convidado.getPeso());

		convidado.comer(ingArroz);
		convidado.comer(ingFeijao);

		System.out.println(convidado.getPeso());

		convidado.comer(sobremesa);

		System.out.println(convidado.getPeso());

	}
}
