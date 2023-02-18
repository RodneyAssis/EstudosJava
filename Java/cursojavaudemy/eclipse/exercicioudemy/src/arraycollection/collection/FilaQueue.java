package arraycollection.collection;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {
	public static void main(String[] args) {
		/*
		 .add() lançará uma exceção caso a fila esteja cheia.

		 .offer() retorna falso caso a fila esteja cheia.
		 */
		
		Queue<String> fila = new LinkedList<>();
		
		// .add -- adicionar a lista, se possui restrição ele cria uma exceção
		// .offer -- adicionar a lista, mas se possui restrição ele n adicionara caso a fila esteja cheia 
		fila.add("Ana"); // lança uma exceção
		fila.offer("ju"); // lança uma restrição e retorna falso
		fila.add("kaio");
		fila.offer("gui");
		fila.add("leleo");
		fila.offer("maycon");

		//metodo peek elemente -- obtem o proximo elemento da fila sem remover
		// diferença é que peek se estiver vazia ele manda null, já element ele manda um erro
		System.out.println(fila.peek()); // retorna null se estiver vazia
		System.out.println(fila.peek()); 
		System.out.println(fila.element()); // lança uma exceção
		System.out.println(fila.element());

		//fila.removeAll(fila);
		
		//System.out.println(fila.peek()); // quando o peek não encontra elementos na lista retorna nulo
		//System.out.println(fila.element());
		
		System.out.println("");		
		
		// pega o primeiro elemento, retorna e depois remove
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // acabou os elementos da lista retorna null
		System.out.println(fila.poll());
		
		//System.out.println(fila.remove()); // remove o elemento, porem caso não tenha nada na fila ele irá retorna uma exceção
	
		//alguns metodos
		// fila.size
		// fila.clear
		// fila. isEmpty

	}
}
