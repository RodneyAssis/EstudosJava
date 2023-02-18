package arraycollection.collection;

import java.util.Objects;

public class Usuario {
	String nome;

	
	public Usuario(String nomeInicial) {
		this.nome = nomeInicial;
	}
	
	public String ToString() {
		return "Olá meu nome é " + this.nome + ".";
	}
		
	// Criação do hascode e equals
	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
	
}
