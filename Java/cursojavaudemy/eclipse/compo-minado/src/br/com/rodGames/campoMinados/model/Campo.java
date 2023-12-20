package br.com.rodGames.campoMinados.model;

import br.com.rodGames.campoMinados.excecoes.ExplocaoExcecao;

import java.util.ArrayList;
import java.util.List;

public class Campo {
    private final int x;
    private final int y;
    private boolean minado;
    private boolean aberto;
    private boolean marcado;
    private final List<Campo> vizinho = new ArrayList<>();

    public Campo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void abrirCampo(){
        if (minado) {
            throw new ExplocaoExcecao();
        } else if (!aberto && !marcado) {
            aberto = true;
            if (vizinhancaSegura()){
                vizinho.forEach(Campo::abrirCampo);
            }
        }
    }

    public void marcarCampo(){
        if (!aberto && !marcado){
            marcado = true;
        }
    }



    boolean vizinhancaSegura(){
        return vizinho.stream().noneMatch(e -> e.minado);
    }

    public void adicionarVizinhanca(Campo vizinhos){
        int diferencaX = Math.abs(this.x - vizinhos.x);
        int diferencaY = Math.abs(this.y - vizinhos.y);
        int diferencaDalta = diferencaX - diferencaY;

        if (diferencaDalta == 1) {
            vizinho.add(vizinhos);
        } else if (diferencaDalta == 2) {
            vizinho.add(vizinhos);
        }
    }

    public boolean isMinado() {
        return minado;
    }

    public void setMinado(boolean minado) {
        this.minado = minado;
    }



    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }


    @Override
    public String toString() {
        if (aberto && minado) {
            return "#";
        } else if (!minado && aberto) {
            return " ";
        } else if (marcado) {
            return "x";
        } else {
            return "?";
        }
    }

    public String verCampo(){
        return "Campo{" +
                "x=" + x +
                ", y=" + y +
                ", minado=" + minado +
                ", aberto=" + aberto +
                ", marcado=" + marcado +
                '}';
    }
}
