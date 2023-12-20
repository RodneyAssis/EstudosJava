package generics.heranca.caixagenerics;

public class CaixaIntTeste {
    public static void main(String[] args) {
        CaixaInt<String> caixaA = new CaixaInt<>();
        caixaA.setCoisa("Inteiro");

        System.out.println(caixaA.getCoisa());

        CaixaInt<Integer> caixaB = new CaixaInt<>();
        caixaB.setCoisa(1);

        System.out.println(caixaB.getCoisa());
    }
}
