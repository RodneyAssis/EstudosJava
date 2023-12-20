package generics.semheranca;

public class CaixaTeste {
    public static void main(String[] args) {
        Caixa<Integer> caixaA = new Caixa<>();
        caixaA.setCoisa(1);

        System.out.println(caixaA.getCoisa());

        Caixa<Boolean> caixaB = new Caixa<>();
        caixaB.setCoisa(true);

        System.out.println(caixaB.getCoisa());
    }
}
