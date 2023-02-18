package oo.composicao;

public class Motor {
	
	//Relacionamento bidirecional
	Carro carro;
	
	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giro() {
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
	
	//Relacionamento bidirecional
	Motor(Carro carro) {
		this.carro = carro;
	}
}
