package oo.composicao.projetogarrafa;

public class Tampa {
	boolean rosqueada;
	
	public Tampa(boolean rosqueada) {
		this.rosqueada = rosqueada;
	}
	
	void FecharGarrafa(boolean value) {
		if (value == true) {
			rosqueada = true;
		} else {
			rosqueada = false;
		}
	}
}
