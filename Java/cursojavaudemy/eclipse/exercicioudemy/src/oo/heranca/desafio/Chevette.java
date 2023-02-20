package oo.heranca.desafio;

public class Chevette extends Carro implements Esportivo {
	
	
	public Chevette(int velmax) {
		super(velmax);
	}

	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub
		aceletacao = 15;
		
	}

	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		aceletacao = 5;
	}	

}
