package jdbc.verificarregistros;

import java.util.UUID;

public class Produtos {

    private UUID ID;
    private String nome;
    private double preco;
    private int qtd;

    public Produtos() {
    }

    public Produtos(UUID ID, String nome, double preco, int qtd) {
        this.ID = ID;
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}

