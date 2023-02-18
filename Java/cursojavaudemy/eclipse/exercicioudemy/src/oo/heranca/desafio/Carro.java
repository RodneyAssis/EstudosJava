package oo.heranca.desafio;

public class Carro {
	public double velAtual;
	
	protected final int velMax;
	
	protected Carro(int velmax) {
		velMax = velmax;
	}
	
	public void acelerar() {
		if (velAtual - 5 > velMax) {
			velAtual = velMax;
		} else {
			velAtual += 5;
		}
	}
	
	public void freiar() {
		// confição para que não criar uma velocidade negativa
		if (velAtual <= 0) {
			velAtual = 0;
		} else {
			velAtual -= 5;
		}
	}
}
