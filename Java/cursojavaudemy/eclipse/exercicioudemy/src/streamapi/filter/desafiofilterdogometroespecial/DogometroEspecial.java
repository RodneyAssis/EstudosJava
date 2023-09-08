package streamapi.filter.desafiofilterdogometroespecial;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DogometroEspecial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        List<Animal> listaAnimais = new ArrayList<>();

        while (true){
            int opcao = input.nextInt();

            if (opcao == 0) {
                break;
            }

            System.out.println("Digite o nome do animal");
            String nomeAnimal = input.next();
            System.out.println("Qual a faça do animal");
            String racaAnimal = input.next();
            System.out.println("Digite a quantidade de patas do animal");
            int qtdPatas = input.nextInt();

            listaAnimais.add(cont, new Animal(nomeAnimal,racaAnimal, qtdPatas));
            cont++;
        }

        Predicate<Animal> isDoguinho = d -> d.getRaca().toUpperCase(Locale.ROOT).equals("DOG");
        Predicate<Animal> isAleijado = a -> a.getQtdPatas() != 4;
        Function<Animal, String> dogAleiojado = da -> "Parabens " + da.getNome() + " você é um doguinho aleijado!!";

        listaAnimais.stream()
                .filter(isDoguinho)
                .filter(isAleijado)
                .map(dogAleiojado).forEach(System.out::println);
    }
}
