package funcoeslambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = val -> {System.out.println(val.nome);};
		
		Produto p1 = new Produto("Caneta1", 1, 0.09);
		Produto p2 = new Produto("Caneta2", 2, 0.03);
		Produto p3 = new Produto("Caneta3", 3, 0.02);
		
		List<Produto> prod = Arrays.asList(p1, p2, p3); 
		
		prod.forEach(imprimir);
		
		
	}
}
