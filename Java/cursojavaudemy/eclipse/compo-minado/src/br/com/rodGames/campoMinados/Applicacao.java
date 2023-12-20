package br.com.rodGames.campoMinados;
import br.com.rodGames.campoMinados.model.Tabuleiro;

import java.util.Scanner;

public class Applicacao {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var tamanhoTabuleiro = 0;
        var qtdBombas = 0;

        System.out.println("Teclas de atalho: \nReinicia: \n-1 Sair: 0" +
                "\nDefina a dificuldado do Campo: \n" +
                "1 - facil - 4x4, 5 bombas\n" +
                "2 - meio - 7x7, 25 bombas\n" +
                "3 - dificil - 10x10, 70 bombas");
        switch (input.nextInt()){
            case 1:
                tamanhoTabuleiro = 4;
                qtdBombas = 5;
                break;
            case 2:
                tamanhoTabuleiro = 7;
                qtdBombas = 1;
                break;
            case 3:
                tamanhoTabuleiro = 10;
                qtdBombas = 70;
                break;
        }

        Tabuleiro tabuleiro = new Tabuleiro(tamanhoTabuleiro, qtdBombas);
        while (true){
            System.out.println(tabuleiro);
//            tabuleiro.verCampo();

            System.out.println("Digite a uma posicao");
            int posicao = input.nextInt();
            if (posicao == -1){
                tabuleiro.reiniciar();
                continue;
            }
            System.out.println("Deseja: abrir - 1 ou marcar - 2");
            var opcao = input.nextInt();
            tabuleiro.decisao(opcao, posicao);
        }
    }
}
