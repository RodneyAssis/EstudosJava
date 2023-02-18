package arraycollection.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		Scanner input = new Scanner(System.in);

		String nomes = "";
		
		while (!("-1".equals(nomes))) {
			System.out.println("Informe um nome:");
			nomes = input.next();
			Usuario u1 = new Usuario(nomes);
			
			lista.add(u1);
			//ou 
			// lista.add(new Usuario("Kaio"));
			// lista.add(new Usuario("maycon"));
		}
		//removendo o ultimo indice que seria o -1
		lista.remove(lista.size()-1);
		
		//Exibir o usuario da posição x
		System.out.println(lista.get(3).nome);
		
		// Removendo da lista pelo indice
		System.out.println(lista.remove(1).nome);
		
		// Removendo da lista pelo nome
		System.out.println(lista.remove(new Usuario("Manu")));
		
		//exibir lista
		for (Usuario usuario : lista) {
			System.out.println(usuario.ToString());
		}

		
		input.close();
	}
}
