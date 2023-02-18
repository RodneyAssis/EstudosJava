package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c = new Carro();
		
		System.out.println(c.verLigado());
		c.motor.ligado = true;
		System.out.println(c.verLigado());
		
		System.out.println(c.motor.giro());
		
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar(); // aqui atingiu o limite maximo de aceleração;
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		c.acelerar();
		
		System.out.println(c.motor.giro());
		
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		c.frear(); // aqui atingiu o limite maximo do freio
		
		//faltou realizar encapsulamento
		//c1.motor.fatorInjecao = -30;
		
		//Ex. de Relação bibirecional
		System.out.println(c.motor.carro.motor.giro());
		
		System.out.println(c.motor.giro());
	}
}
