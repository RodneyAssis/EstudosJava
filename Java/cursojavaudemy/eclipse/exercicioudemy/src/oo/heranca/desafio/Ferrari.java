package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {

	public Ferrari(int velmax) {
		super(velmax);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ligarTurbo() {
		aceletacao = 30;
		
	}

	@Override
	public void desligarTurbo() {
		aceletacao = 10;
		
	}

}
