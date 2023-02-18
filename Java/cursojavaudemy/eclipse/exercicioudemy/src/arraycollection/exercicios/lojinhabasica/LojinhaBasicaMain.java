package arraycollection.exercicios.lojinhabasica;

import java.util.Hashtable;
import java.util.Scanner;

public class LojinhaBasicaMain {
	public static void main(String[] args) {
		// Cliente chegará no caixa e antes de passar os produtos a funcionaria irá
		// pergunta e o cliente possui cadastro:
		// caso ele não possua: solicitar o nome, cpf, numero
		// caso ele possua acrescente desconto de 10% em suas compras
		// caso ele não possua e nem queira passar normalmente
		// registre tudo em uma lista:
		Scanner input = new Scanner(System.in);

		// Esquema do mapeamento {Codigo : [Nome, preço]}

		System.out.println("Informe Nome do produto: ");
		String nomeProduto = input.next();
		System.out.println("Informe o preço do produto: ");
		String precoNums = input.next();
		
		Hashtable<String, Produto> codProdutos = new Hashtable<>();


		Produto p1 = new Produto(nomeProduto, precoNums);

		codProdutos.put("001", p1);

		for (int i = 0; i <= codProdutos.size(); i++) {
			System.out.println(codProdutos.keys());
		}

		input.close();
	}
}
