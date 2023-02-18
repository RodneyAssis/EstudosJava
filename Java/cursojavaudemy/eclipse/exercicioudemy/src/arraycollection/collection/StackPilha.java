package arraycollection.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackPilha {
	public static void main(String[] args) {
		//utilizado logica lifo
		
		Deque<String> livros = new ArrayDeque<>();
		
		//metodos de adição
		livros.add("O pequeno principe"); // add addiciona um valor booleano
		livros.push("Don Quixote"); // ele retorna uma exceção
	
		//metodos de exibição
		System.out.println(livros.peek()); // retorna o ultimo elemento
		System.out.println(livros.element()); // não adiciona nada
		
		//metodos de remoção
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		// System.out.println(livros.remove());
		
		// System.out.println(livros.pop()); // metodo de remoção da pilha
		
		
		 for (String string : livros) {
			System.out.println(string);
		}
	}
}
