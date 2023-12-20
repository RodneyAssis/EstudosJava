package generics.commetodos;

import java.util.Arrays;

public class ListaUtilTeste {
    public static void main(String[] args) {
        var lista = Arrays.asList("JS", "PHP", "JS", "JAVA", "HTML", "CSS");
        var lista1 = Arrays.asList(0, 1, 2, 3, 4, 5);

        String LinguagemL = (String) ListaUtil.pegarUltimo(lista);
        Integer LinguagemLa = (Integer) ListaUtil.pegarUltimo(lista1);

        System.out.println(LinguagemLa);

        var linguagem = ListaUtil.pegarUltimoValorUniversal(lista);

        System.out.println(linguagem);

    }
}
