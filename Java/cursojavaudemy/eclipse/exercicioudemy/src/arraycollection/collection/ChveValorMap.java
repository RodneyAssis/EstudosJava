package arraycollection.collection;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;

public class ChveValorMap {
	public static void main(String[] args) {
		Map<Integer, String> user = new HashMap<>();
		
		//metodos de "adição";
		user.put(1, "Gegeo");
		//user.put(1, "ricardo"); // mantiveram a chave e alterado valor
		user.put(2, "kaio");
		user.put(40, "kaio"); // não é ordenado
		user.put(3, "aaio");
		
	
	
		System.out.println(user.size());
	
		//metodo para exibir os valores chaves
		System.out.println(user.keySet());
		
		
		//metodos para exibir os valores
		System.out.println(user.values());
		
		System.out.println(user.entrySet());
		
		
		//metodo de verificação
		System.out.println(user.containsKey(1));
		System.out.println(user.containsValue("Gegeo"));
		
		//exibe o valor da chave
		System.out.println(user.get(40));
		
		//motodo de remoção
		System.out.println(user.remove(1));
		System.out.println(user.remove(1, "djnkjsn"));
		
		//metodo de percorrer seja chaves ou valores ou os dois
		for (int k : user.keySet()) {
			System.out.println(k);
		}
		for (String v : user.values()) {
			System.out.println(v);
		}
		
		for (Entry<Integer, String> r : user.entrySet()) {
			System.out.print(r.getKey());
			System.out.println(" " + r.getValue());
		}
		
	}
}
