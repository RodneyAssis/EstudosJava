package streamapi.reduce.exercicios;

//        pegar nota dos alunos
//        filtrar notas entre aprovados e reprovados
//        fazer uma media dos que foram aprovados e reprovados


import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Reduce2 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var listaAlunos = new ArrayList<AlunosReduce2>();

        var cont = 0;
        while (true){
            System.out.println("Digite 0 para sair: ");
            var opcao = input.nextInt();
            if (opcao == 0){
                break;
            }

            System.out.println("Digite o nome do aluno: ");
            var nomeAluno = input.next();
            System.out.println("Digite o a nota do auno: ");
            var notaAluno = input.nextDouble();

            listaAlunos.add(cont, new AlunosReduce2(nomeAluno, notaAluno));
            cont++;
        }

        var opcao = input.nextInt();
        BinaryOperator<Double> soma = Double::sum;
        switch (opcao) {
            // Exibir nome e nota dos alunos aprovados e a media.
            case 1 -> {
                // Exibir alunos aprovados
                Function<AlunosReduce2, String> aprovados = a -> a.getNome() + " aprovado com nota: " + a.getNota();
                listaAlunos.stream()
                        .filter(AlunosReduce2::getAprovado)
                        .map(aprovados)
                        .forEach(System.out::println);

                // Soma das notas dos alunos.
                var mediaAlunos = listaAlunos.stream()
                                        .filter(AlunosReduce2::getAprovado)
                                        .map(AlunosReduce2::getNota)
                                        .reduce(0.0, soma);

                // Contador
                var contAlunos = listaAlunos.stream().filter(AlunosReduce2::getAprovado)
                        .map(AlunosReduce2::getNota)
                        .reduce(0.0, (acu, n) -> acu + 1);


                System.out.println("Media dos alunos: " + mediaAlunos/contAlunos);
            }
            // Exibir nome e nota dos alunos reprovados e a media
            case 2 -> {
                // Exibir alunos reprovados
                listaAlunos.stream()
                        .filter(e -> !e.getAprovado())
                        .map(e -> "Infelizmente " + e.getNome() + " você não atingiu a média" +
                                " 7," + " sua nota ficou: " + e.getNota()).forEach(System.out::println);

                // Soma das nota
                var mediaAlunosR = listaAlunos.stream()
                        .filter(r -> !r.getAprovado())
                        .map(AlunosReduce2::getNota)
                        .reduce(0.0,soma);

                // Contador
                var contAlunosR = listaAlunos.stream().filter(e -> !e.getAprovado())
                        .map(AlunosReduce2::getNota)
                        .reduce(0.0, (acu, n) -> acu + 1);

                System.out.println(mediaAlunosR/contAlunosR);
            }
        }
    }
}
