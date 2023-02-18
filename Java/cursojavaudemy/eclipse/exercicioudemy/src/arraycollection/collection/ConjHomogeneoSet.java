package arraycollection.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjHomogeneoSet {
	public static void main(String[] args) {
		// Set<String> lista = new HashSet<>(); //Essa lista sera exclusiva para String
		SortedSet<String> lista = new TreeSet<>();

		// lista.add(1); //Não funfa
		lista.add("1.2");
		lista.add("c");
		lista.add("kaio");
		lista.add("yuri");
		lista.add("leleo");

		// Não respeteira a ordem se for utilizado com Metodo Set, mas para organizar de
		// forma alfabetica
		// pode-se utilizar o SortedSet com TreeSet
		for (String s : lista) {
			System.out.println(s);
		}

		Set<String> nums1 = new HashSet<>(); // Essa lista sera exclusiva para String

		// lista.add(1); //Não funfa
		nums1.add("1");
		nums1.add("3");
		nums1.add("2");
		nums1.add("5");
		nums1.add("4");

		for (String d : nums1) {
			System.out.println(d);
		}
	}
}
