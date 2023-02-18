package oo.composicao;

public class Carro {
	//Motor motor;
	Motor motor = new Motor(this);

	
	void acelerar() {
		//fatores de parada
		if (motor.fatorInjecao <= 2.4) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if (motor.fatorInjecao > 0.4) {
			motor.fatorInjecao += -0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean verLigado() {
		return motor.ligado;
	}
}
