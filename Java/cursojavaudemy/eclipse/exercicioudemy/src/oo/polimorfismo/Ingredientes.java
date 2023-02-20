package oo.polimorfismo;

public abstract class Ingredientes {
	private double peso;

	public Ingredientes() {
		this.getPeso();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}

}
