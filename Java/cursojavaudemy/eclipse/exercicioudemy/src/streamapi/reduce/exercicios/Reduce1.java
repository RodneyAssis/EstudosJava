package streamapi.reduce.exercicios;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var listaDeProdutos = new ArrayList<ProdutoReduce1>();

        var indice = 0;
        while (true){
            var opcao = input.nextInt();
            if (opcao == 0){
                break;
            }

            System.out.println("Nome do produto:");
            var nomeProduto = input.next();
            System.out.println("Preco: ");
            var precoProduco = input.nextDouble();

            listaDeProdutos.add(indice, new ProdutoReduce1(nomeProduto, precoProduco));
        }
        System.out.println("Total de capital registrado:");
//        var inflacao = 0.54;
        BinaryOperator<Double> soma = Double::sum;

//        var total = listaDeProdutos.stream().map(e -> e.getPreco()).reduce(0.0, soma);
//        var total = listaDeProdutos.parallelStream().map(e -> e.getPreco()).reduce(inflacao, soma);
//        System.out.println(total);

        listaDeProdutos.stream()
                .map(ProdutoReduce1::getPreco)
                .filter(preco -> preco > 100)
                .reduce(soma)
                .ifPresent(System.out::println); // Caso Exista ele apresente senão não aparece nada
    }
}
