package estoque;

public class Produto {
	private String marca;
	private String tipo;
	private double preco;

	public Produto(String tipo, String marca, double preco) {
		// TODO Auto-generated constructor stub
		this.tipo = tipo;
		this.marca = marca;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
