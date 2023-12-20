package streamapi.minmax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Minmax {
    public static void main(String[] args) {
        var a1 = new Aluno("Gabi", 8.9);
        var a2 = new Aluno("abi", 6.2);
        var a3 = new Aluno("babi", 4.2);
        var a4 = new Aluno("cabi", 5.2);

        List<Aluno> listaAlunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> maiorNota = (aluno1, aluno2) -> {
            if (aluno1.getNota() > aluno2.getNota()) return 1;
            if (aluno1.getNota() < aluno2.getNota()) return -1;
            return 0;
        };

        System.out.println(listaAlunos.stream().max(maiorNota));
    }
}
