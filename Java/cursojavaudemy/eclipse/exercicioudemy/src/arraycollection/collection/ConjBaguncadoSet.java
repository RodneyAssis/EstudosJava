package arraycollection.collection;

import java.util.HashSet;
import java.util.Set;

public class ConjBaguncadoSet {
	@SuppressWarnings({"rawtypes", "unchecked"}) // silencia as advertencias.
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("Testo");
		conjunto.add(1);
		conjunto.add('X');

		// adicionar elementos
		System.out.println(conjunto.size());

		conjunto.add("Teste");

		System.out.println(conjunto.size());

		// remover elemento.

		conjunto.remove("Teste");
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove(1));
		System.out.println(conjunto.remove("Testq"));

		System.out.println(conjunto.size());

		// verificar elemento no conjunto.

		System.out.println(conjunto.contains(1.3));

		System.out.println(conjunto.size());

		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		// união dos conjuntos:

		// conjunto.addAll(nums);

		// System.out.println(conjunto);

		// retem o elemento entre os dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);

		// limpa os valores da lista
		conjunto.clear();
		System.out.println(conjunto);
	}
}
