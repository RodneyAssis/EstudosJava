package oo.desafioModificadorAcesso;

import oo.heranca.Direcao;
import oo.heranca.Jogador;
import oo.heranca.Jogador2;
import oo.heranca.Jogador1;

public class jogoMain extends Jogador {
	public static void main(String[] args) {

		Jogador1 j1 = new Jogador1(5, 6);	
		
		Jogador2 j2 = new Jogador2(5, 8);
		
		j1.viewPontosDeVida();
		j2.viewPontosDeVida();

		j1.andar(Direcao.LESTE);
		
		j1.atacar(j2);
		
		j2.andar(Direcao.SUL);
		j2.andar(Direcao.SUL);
		
		j2.atacar(j1);
		
		j1.viewPontosDeVida();
		j2.viewPontosDeVida();
	}
}
