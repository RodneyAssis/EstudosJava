package br.com.teste.exerciciosTeste.models.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String nome;
    @Min(0)
    private float preco;
    @Min(0)
    @Max(100)
    private int desconto;

    @Min(0)
    private float precoComDesconto;


    public Produto() {

    }

    public Produto(String nome, float preco, int desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public void aplicarDesconto(float desconto, float preco){
        this.precoComDesconto = preco - (preco * (desconto/100));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public float getPrecoComDesconto() {
        return precoComDesconto;
    }

    public void setPrecoComDesconto(float precoComDesconto) {
        this.precoComDesconto = precoComDesconto;
    }
}
