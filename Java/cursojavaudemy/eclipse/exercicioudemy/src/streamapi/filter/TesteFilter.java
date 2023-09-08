package streamapi.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

public class TesteFilter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tamanho = 0;
        List<Animal> listaanimais = new ArrayList<>();

        while (true) {
            int opcao = input.nextInt();
            System.out.println("Digite 0 para sair");
            if (opcao == 0){
                break;
            }
            System.out.println("Digite o nome do seu animal");
            String nomeAnimal = input.next();
            System.out.println("Digite sua Raça");
            String racaAnimal = input.next();

            listaanimais.add(tamanho, new Animal(nomeAnimal, racaAnimal.toUpperCase(Locale.ROOT)));
            tamanho++;
        }

        listaanimais.stream().filter(e -> e.getRaca().equals("DOG"))
                .map(n -> "Parabens " + n.getNome() + " você é um doginho")
                .forEach(System.out::println);
    }
}
