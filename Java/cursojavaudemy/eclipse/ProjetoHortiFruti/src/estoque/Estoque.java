package estoque;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	List<Item> estoque = new ArrayList<>();

	// Metodos auxliares

	// Adicionar arquivo na lista<utilizando os atribulos Itens>
	public void adicionarLista(String tipo, String marca, double preco, int quantidade) {
		Produto p = new Produto(tipo, marca, valorPrecoNegativo(preco));
		this.estoque.add(new Item(p, valorQtdNegativo(quantidade)));
	}

	// Remover produto da lista através do indice
	public void removerLista(String nomeProduto) {
		for (int i = 0; i < estoque.size(); i++) {
			if (estoque.get(i).p.getMarca().equalsIgnoreCase(nomeProduto)) {
				estoque.remove(i);
			}
		}
	}

	// Alterar valor da quantidade/preço dentro da lista
	public void alterarPreco(String nome, int opcao, double novoPreco, int novaQuantidade) {
		for (int i = 0; i < estoque.size(); i++) {
			// mapear a lista e buscar e puxar o indice desejado
			if (estoque.get(i).p.getMarca().equalsIgnoreCase(nome)) {
				// caso queira alterar preco digita 1
				if (opcao == 1) {
					estoque.get(i).p.setPreco(novoPreco);
					;
					// caso queira alterar a quantidade digita 2
				} else if (opcao == 2) {
					estoque.get(i).setQuantidade(novaQuantidade);
				}
			}
		}
	}

	// Visualizar lista apartir de um laço de repetição
	public void visualizarLista() {
		// Verificar Lista
		for (int i = 0; i < estoque.size(); i++) {
			System.out.printf("Produto: %s\nMarca: %s\nPreco: %.2f\nQuantidade: %dunid\n\n", estoque.get(i).p.getTipo(),
					estoque.get(i).p.getMarca(), estoque.get(i).p.getPreco(), estoque.get(i).getQuantidade());

		}
		// condição caso a lista estiver vazia imprimir está informação.
		if (estoque.size() == 0) {
			System.out.println("Nenhum produto no estoque");
		}
	}

	// Tratamentos

	private int valorQtdNegativo(int qtd) {
		if (qtd <= 0) {
			return qtd = 0;
		}
		return qtd;
	}

	private double valorPrecoNegativo(double preco) {
		if (preco <= 0) {
			return preco = 0;
		}
		return preco;
	}
}
