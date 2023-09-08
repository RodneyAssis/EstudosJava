package streamapi.filter.desafiofilterdogometroespecial.desafiododesafio;

import oo.composicao.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var listaProdutos = new ArrayList<Produtos>();

        var opcao = 1;
        var cont = 0;

        listaProdutos.add(cont, new Produtos("Tomate", 300));
        cont++;
        while (opcao != 0){
            System.out.println("Para sair digite 0");
            opcao = input.nextInt();

            System.out.println("Nome do produto: ");
            var nomeProduto = input.next();
            System.out.println("preco do Produto: ");
            var precoProduto = input.nextInt();

            listaProdutos.add(cont, new Produtos(nomeProduto, precoProduto));
            cont++;
        }
        Predicate<Produtos> isFreteGratis = Produtos::isFrete;
        Predicate<Produtos> isDesconto = d -> d.getDesconto() == 30;
        Function<Produtos, String> produtosCDescontoEFreteG = dg -> "O " + dg.getNome() + " que estava por " +
                dg.getAntigoPreco() + " esta com desconto de 30% de desconto por " + dg.getPreco();

        listaProdutos.stream()
                .filter(isFreteGratis)
                .filter(isDesconto)
                .map(produtosCDescontoEFreteG).forEach(System.out::println);
    }
}