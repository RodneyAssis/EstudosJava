package funcoeslambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		
		// Predicado util para tratar funções 
		Predicate<Produto> isCaro = prod 
				-> {if (prod.preco > 1000) {
					return true;} else {
					return false;}};
		
		Produto p = new Produto("notebook", 2000, 0.15);
		
		System.out.println(isCaro.test(p));
	}
}
