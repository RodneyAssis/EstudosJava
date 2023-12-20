package generics.dicionarios;

public class ParesTeste {
    public static void main(String[] args) {
        var valor = new Pares<Integer, String>();

        valor.adicionar(1, "Valores");
        valor.adicionar(4, "Valores");
        valor.adicionar(3, "Valores");
        valor.adicionar(2, "Valores");
        valor.adicionar(3, "Valores");
        valor.adicionar(1, "Muleres");



        System.out.println(valor.pegarValor(1));
    }
}
