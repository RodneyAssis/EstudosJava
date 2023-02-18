package pacotemain;

import java.util.Scanner;

import estoque.Estoque;

public class test extends Estoque {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String tipoProduto = "";
		String marcaProduto = "";
		double preco = 0;
		int quantidade = 0;
		
		Estoque e1 = new Estoque();
		
		while (true) {
			System.out.println("\nESTOQUE\n"
					+ 		   "1 - Adicionar produto\n"
					+ 		   "2 - Remover produto\n"
					+ 		   "3 - Alterar produto\n"
					+ 		   "4 - visualizar estoque\n"
					+ 		   "5 - sair"
					+ 	 	   "\nInfome a função desejada: ");
			int opcao = input.nextInt();
			switch (opcao) {
			case 1:
				//Adicionar produtos na lista
				// * modificar > adicionar um novo atributo marca e alterar atributo nome para tipo onde tipo irá receber a categoria
				// do produto: -- feito
				// * ex.: tipo: Biscoito, marca: Bono, preco: 5,90 e quantidade: 5unid. -- feito 
				
				// - caso exista um produto com o mesmo tipo e marca passar a informação de que já existe esse 
				// produto no estoque e dar a opção de alterar o preco do produto e adicionar mais produtos na quantidade no estoque
				// ex: quantidadeProduto = quantidadeQJaTeve + quantidadeAdicional
				System.out.println("Informe o tipo de produto: ");
				tipoProduto = input.next();
				System.out.println("Informe a marca do produto: ");
				marcaProduto = input.next();
				System.out.println("Informe o preco: ");
				preco = input.nextDouble();
				System.out.println("Quantidade: ");
				quantidade = input.nextInt();
				
				e1.adicionarLista(tipoProduto.toLowerCase(), marcaProduto.toLowerCase(), preco, quantidade);
				break;
					
			case 2:
				// Remover um produto da lista
 				System.out.println("Informe o nome do produto que deseja remover: ");
				marcaProduto = input.next();
				e1.removerLista(marcaProduto);
				break;
				
			case 3:
				// Alterar dados do produto
				// - Deve ter a condição de alterar preco, e quantidade
				System.out.println("Digite o nome do produto: ");
				marcaProduto = input.next();
				System.out.println("1 - Alterar preco\n"
						+ 		   "2 - Alterar quantidade"
						+ 		   "Informe a opcao desejada: ");
				opcao = input.nextInt();
				switch (opcao) {
				case 1:
					System.out.println("Informe oo novo preco: ");
					preco = input.nextDouble();
					e1.alterarPreco(marcaProduto, opcao, preco, quantidade);
					break;
				case 2:
					System.out.println("Informe oo nova quantidade: ");
					quantidade = input.nextInt();
					e1.alterarPreco(marcaProduto, opcao, preco, quantidade);
					break;
				default:
					System.out.println("Valor Invalido.");
				}
				break;
				
			case 4:
				System.out.println("VISUALIZAR ESTOQUE: \n");
				e1.visualizarLista();
				
				@SuppressWarnings("unused") 
				String pass = input.next();
				break;
			default:
				break;
			}
		if (opcao == 5) {
			break;
		}
		}	
		input.close();
	}
}
