package streamapi.match;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class match {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var listaAnimais = new ArrayList<Animal>();


        var cont = 0;
        while (true) {
            var opcao = input.nextInt();
            if (opcao == 0){
                break;
            }

            System.out.println("Nome do Animal:");
            var nomeAnimal = input.next();
            System.out.println("Quantidade de patas: ");
            var qtdPatasAnimal = input.nextInt();

            listaAnimais.add(cont, new Animal(nomeAnimal, qtdPatasAnimal));
            cont++;
        }

        Predicate<Animal> saldavel = e -> e.getQtdPatas() == 4;

//        Quando todos seguem os requisitos da lista.
        var dogsSaldaveis = listaAnimais.stream().allMatch(saldavel);
        System.out.println("Todos os dogs estão Saldaveis? \n" + dogsSaldaveis);
//        Quando pelo menos 1 dos objetos da lista seguem os requisitos
//        var algumDogSaldavel = listaAnimais.stream().anyMatch(saldavel);
//        Quando nenhum dos objetos da lista seguem os requisitos
//        var DogsEspeciais = listaAnimais.stream().noneMatch(saldavel);
    }
}
