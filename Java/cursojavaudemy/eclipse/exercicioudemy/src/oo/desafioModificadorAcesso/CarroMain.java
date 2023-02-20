package oo.desafioModificadorAcesso;

import oo.heranca.desafio.Chevette;
import oo.heranca.desafio.Ferrari;

public class CarroMain {
	public static void main(String[] args) {
	 	Ferrari c1 = new Ferrari(280);
		Chevette c2 = new Chevette(180);
		
		
		c1.ligarTurbo();
		for (int i = 0; i < 5; i++) {
			c1.acelerar();
			System.out.println(c1.velAtual);
		}
		
		for (int i = 0; i < 5; i++) {
			c1.freiar();
		}
		
		System.out.println(c1.velAtual);
	
		c2.desligarTurbo();
		c2.ligarTurbo();
		for (int j = 0; j < 5; j++) {
			c2.acelerar();
			System.out.println(c2.velAtual);
		}
		
		for (int j = 0; j < 5; j++) {
			c2.freiar();
		}
		
		System.out.println(c1.velAtual);
		
		}
}
