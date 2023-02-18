package oo.composicao.projetogarrafa;

public class Garrafa {
	Tampa t = new Tampa(true);
	final double volumeMax = 2;
	double volume = 0;
	boolean cheia = false;
	public Garrafa() {
		
	}
	
	public Garrafa(double volume, boolean cheia) {
		this.volume = volume;
		this.cheia = cheia;
	}
	
	void encher(double vol) {
		if (cheia == false && t.rosqueada == false) {
			volume += vol;
		}
		viewCheia();
	}
	
	void esvaziar(double vol) {
		double volumeGarrafa = volume - vol;
		
		if (volumeGarrafa > 0 && t.rosqueada == false) {
			volume -= vol;
		} else if (volumeGarrafa <= 0) {
			volume = 0;
		}
		viewCheia();
	}
	
	 void viewCheia() {
		 if (volume >= volumeMax) {
			cheia = true;
		} else {
			cheia = false;
		}
	 }
}
