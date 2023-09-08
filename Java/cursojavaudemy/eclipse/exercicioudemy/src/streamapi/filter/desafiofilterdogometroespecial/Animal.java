package streamapi.filter.desafiofilterdogometroespecial;

public class Animal {
    private String nome;
    private String raca;
    private int qtdPatas;

    public Animal(String nome, String raca, int qtdPatas) {
        this.nome = nome;
        this.raca = raca;
        this.qtdPatas = qtdPatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }
}
