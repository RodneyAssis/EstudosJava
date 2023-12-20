package generics.heranca.caixagenerics.comexcecao;

import java.util.Scanner;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        var C = new CaixaNumero<Integer>();
        C.setCoisa(3);

        System.out.println(C.getCoisa());
        }
}
