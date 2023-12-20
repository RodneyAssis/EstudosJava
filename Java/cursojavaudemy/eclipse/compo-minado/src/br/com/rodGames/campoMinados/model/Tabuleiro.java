package br.com.rodGames.campoMinados.model;

import br.com.rodGames.campoMinados.excecoes.ExplocaoExcecao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tabuleiro {
    private final int tamanhadoCampo;
    private final int qtdMinas;
    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int tamanhadoCampo, int qtdMinas) {
        this.tamanhadoCampo = tamanhadoCampo;
        this.qtdMinas = qtdMinas;

        gerarCampo(tamanhadoCampo);
        adicionarMina();
    }

    void vizinhos(){
        for (int i = 0; i < tamanhadoCampo; i++) {
            for (int j = 0; j < tamanhadoCampo; j++) {

            }
        }
    }

    public void gerarCampo(int tamanhadoCampo){
        for (int i = 0; i < tamanhadoCampo; i++) {
            for (int j = 0; j < tamanhadoCampo; j++) {
                campos.add(new Campo(i, j));
            }
        }
    }
    public void adicionarMina(){
        long armazenarMina = 0;
        Random random = new Random();
        do {
            var valor = random.nextInt(tamanhadoCampo*tamanhadoCampo);
            armazenarMina = campos.stream().filter(Campo::isMinado).count();
            campos.get(valor).setMinado(true);
        }while (armazenarMina < qtdMinas-1);
    }

    public void decisao(int opcao, int posicao) {
        if (opcao == 1){
            campos.get(posicao-1).abrirCampo();
        } else if (opcao == 2) {
            campos.get(posicao-1).marcarCampo();
        }
    }

    public void reiniciar(){
        for (Campo c: campos) {
            c.setMinado(false);
            c.setAberto(false);
            c.setMinado(false);
        }
        gerarCampo(tamanhadoCampo);
        adicionarMina();
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        var cont = 0;
        for (int i = 0; i < tamanhadoCampo; i++) {
            for (int j = 0; j < tamanhadoCampo; j++) {
                sb.append(" ");
                sb.append(campos.get(cont));
                sb.append(" ");
                cont++;
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void verCampo(){
        for (Campo c: campos) {
            System.out.println(c.verCampo());
        }
    }
}
