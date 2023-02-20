package oo.heranca.desafio;

public class Carro {
	public double velAtual;
	public int aceletacao;
	
	protected final int velMax;
	
	protected Carro(int velmax) {
		velMax = velmax;
	}
	
	public void acelerar() {
		if (velAtual - 5 > velMax) {
			velAtual = velMax;
		} else {
			velAtual += aceletacao;
		}
	}
	
	public void freiar() {
		// confição para que não criar uma velocidade negativa
		if (velAtual <= 0) {
			velAtual = 0;
		} else {
			velAtual -= (aceletacao-5);
		}
	}
}
