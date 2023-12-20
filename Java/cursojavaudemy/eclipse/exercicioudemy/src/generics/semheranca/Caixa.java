package generics.semheranca;

public class Caixa<T> {
    private T coisa;

    public Caixa() {

    }

    public void setCoisa(T coisa) {
        this.coisa = coisa;
    }

    public T getCoisa() {
        return coisa;
    }
}
