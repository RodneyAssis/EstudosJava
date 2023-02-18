package pacotemain;

import java.util.Scanner;

import estoque.Estoque;

public class menuEstoque extends Estoque {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String tipoProduto = "";
		String marcaProduto = "";
		double preco = 0;
		int quantidade = 0;
		int opcao = 0;
		Estoque e1 = new Estoque();

		// INICIO MENU PRINCIPAL
		while (true) {
			System.out.println("MERCEARIA HORFIFRUTE\n" + 
							   "1 - Estoque\n" + 
							   "2 - \n" + 
							   "3 - \n" + 
							   "4 - \n" + 
							   "5 - sair" + 
							   "\nInfome a função desejada: ");
			opcao = input.nextInt();
			switch (opcao) {

			// INICIO Menu do Estoque
			case 1:
				while (true) {
					System.out.println("\nESTOQUE\n" + 
									   "1 - Adicionar produto\n" + 
									   "2 - Remover produto\n" + 
									   "3 - Alterar produto\n" + 
									   "4 - visualizar estoque\n" + 
									   "5 - sair" + 
									   "\nInfome a função desejada: ");
					opcao = input.nextInt();
					switch (opcao) {
						// INICIO Adicionar produtos na lista
						case 1:
						{
							/*
							 * modificar > adicionar um novo atributo marca e alterar atributo nome para
							 tipo onde tipo irá receber a categoria
							 do produto: -- FEITO
							 * ex.: tipo: Biscoito, marca: Bono, preco: 5,90 e quantidade: 5unid. -- FEITO
	
							 -- caso exista um produto com o mesmo tipo e marca passar a informação de que
							 já existe esse produto no estoque e dar a opção de alterar o preco do produto
							 e adicionar mais produtos na quantidade no estoque -- N/FEITO
							 -- ex: quantidadeProduto = quantidadeQJaTeve + quantidadeAdicional
							 */
							System.out.println("Informe o tipo de produto: ");
							tipoProduto = input.next();
							System.out.println("Informe a marca do produto: ");
							marcaProduto = input.next();
							System.out.println("Informe o preco: ");
							preco = input.nextDouble();
							System.out.println("Quantidade: ");
							quantidade = input.nextInt();
	
							e1.adicionarLista(tipoProduto.toLowerCase(),
											  marcaProduto.toLowerCase(),
											  preco, quantidade);
							break;
						} // FIM do adicionar produto na lista
							
						// INICIO do Remover um produto da lista
						case 2: 
						{
							System.out.println("Informe o nome do produto que deseja remover: ");
							marcaProduto = input.next();
							e1.removerLista(marcaProduto);
							break;
						} // FIM do Remover um produto da lista
						
						// INICIO de Alterar dados do produto
						case 3: 
						{
							// - Deve ter a condição de alterar preco, e quantidade
							System.out.println("Digite o nome do produto: ");
							marcaProduto = input.next();
							System.out.println(
									"1 - Alterar preco\n" + 
									"2 - Alterar quantidade" + 
									"Informe a opcao desejada: ");
							opcao = input.nextInt();
							switch (opcao) {
								case 1: 
								{
									System.out.println("Informe oo novo preco: ");
									preco = input.nextDouble();
									e1.alterarPreco(marcaProduto, opcao, preco, quantidade);
									break;
								}
								case 2:
								{
									System.out.println("Informe oo nova quantidade: ");
									quantidade = input.nextInt();
									e1.alterarPreco(marcaProduto, opcao, preco, quantidade);
									break;
								}
								default:
								{
									System.out.println("Valor Invalido.");
								}
							}
							break;
						} // FIM de Alterar dados do produto
						
						// INICIO da tela de visualização	
						case 4:
						{
							System.out.println("VISUALIZAR ESTOQUE: \n");
							e1.visualizarLista();
	
							System.out.println("Digite para sair.");
							@SuppressWarnings("unused")
							String pass = input.next();
							break;
						} // FIM da tela de visualização
							
						// INICIO DE SAIR
						case 5: 
						{
							break;
						}
						default:
						{
							System.out.println("Valor invalido.");
						}
					}
					if (opcao == 5) {
						opcao = 0;
						break;
					}
					
				}	
				// FIM Menu do Estoque
					
			case 2:

			// SAIR DO MENU PRINICIPAL
			case 5:
				break;
			default:
				System.out.println("Valor invalido.");
				break;
			}
		if (opcao == 5) {
			opcao = 0;
			break;
			}
		}
		// FIM MENU PRINCIPAL
		input.close();
	}
}
