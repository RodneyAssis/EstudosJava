package classesmetodos;

public class equalsUsuario {
	String nome, email;
	
	public equalsUsuario() {
	}
	
	equalsUsuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public boolean equals(Object objeto) {
		if (objeto instanceof equalsUsuario) {
			equalsUsuario outro = (equalsUsuario) objeto;

			return outro.nome.equals(this.nome);
		} else {
			return false;
		}
	}
	
	
	
}
