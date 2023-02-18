package oo.heranca;

public class Jogador {
	protected int x, y;
	int xInicial = 0;
	int yInicial = 0;
	int Vida = 100;
	
	
	public void atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x); 
		int deltaY = Math.abs(y - oponente.y); 
		
		if (deltaX == 0 && deltaY == 1) {
			oponente.Vida -= 20;
			System.out.println("Ataque bem-efetuado!");
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.Vida -= 20;
			System.out.println("Ataque bem-efetuado!");
			oponente.andar(null);
		} else {
			System.out.println("Ataque falso");
		}
	}
	
	public void andar(Direcao di) {
		if (di == Direcao.NORTE) {
			System.out.println("Movimento para frente");
			y++;
		} else if (di == Direcao.LESTE) {
			System.out.println("Movimento para esquerda");
			x--;
		} else if (di == Direcao.SUL) {
			System.out.println("Movimento para trás");
			y--;
		} else if (di == Direcao.OESTE) {
			System.out.println("Movimento para direita");
			x++;
		}
				
		if ((this.x == xInicial) && (this.y == yInicial)) {
			System.out.println("Não houve movimentação na peça");
		}
		
		if ((this.x == 0) && (this.y == 0)) {
			System.out.println("Retornei ao ponto Inicial");
		}
		xInicial = x;
		yInicial = this.y;
		
		viewPosicao();
	}
	
	public void viewPontosDeVida() {
		System.out.println("Pontos de vida: " + Vida);
	}
	
	public void viewPosicao() {
		System.out.printf("\nPosição X: %d\nPosição Y: %d\n", x, y);
	}
	
	
}
