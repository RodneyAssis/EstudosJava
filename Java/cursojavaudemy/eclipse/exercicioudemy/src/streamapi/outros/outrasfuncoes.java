package streamapi.outros;

import streamapi.minmax.Aluno;
import java.util.Arrays;

public class outrasfuncoes {
    public static void main(String[] args) {
        var a1 = new Aluno("Gabi", 8.9);
        var a2 = new Aluno("abi", 6.2);
        var a3 = new Aluno("babi", 4.2);
        var a4 = new Aluno("cabi", 5.2);
        var a5 = new Aluno("Gabi", 8.9);
        var a6 = new Aluno("abi", 6.2);
        var a7 = new Aluno("babi", 4.2);
        var a8 = new Aluno("cabi", 5.2);

        var listaAluno = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);

//      distinct funcao mapea a lista e verifica se possui dados iguais e remove
//      eles da lista mostra a lista sem repeticao
        System.out.println("DISTINCT");
        listaAluno.stream()
                .distinct()
                .forEach(System.out::println);

//        skip funcao começa a lista apartir do indice solicitado
//        limit funcao que exibir a lista apartir do indice solicitado não exibe acima do indice
        System.out.println("\nSKIP/LIMIT");
        listaAluno.stream()
                .limit(4)
                .skip(2)
                .forEach(System.out::println);

//        takeWhile exibi apenas os usuarios seguindo as condições.
        System.out.println("\nTAKEWHILE");
        listaAluno.stream()
                .takeWhile(a -> a.getNota() >= 6)
                .forEach(System.out::println);

    }
}

