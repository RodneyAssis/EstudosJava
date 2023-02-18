package arraycollection.exercicios.lojinhabasica;

import java.util.Objects;

public class Produto {
	String codigo, nome;
	String preco;
	
	public Produto(String codigo, String nome, String preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto() {
		this("001", "Agua", "999");
	}
	
	public Produto(String nome, String preco) {
		this.nome = nome;
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(nome, other.nome)
				&& preco == other.preco;
	}
	
	
}
