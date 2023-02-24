package funcoeslambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimir = val -> {System.out.println(val.nome);};
		
		Produto p1 = new Produto("Caneta1", 1, 0.09);
		Produto p2 = new Produto("Caneta2", 2, 0.13);
		Produto p3 = new Produto("Caneta3", 3, 0.02);
		
		List<Produto> prod = Arrays.asList(p1, p2, p3); 
		
		prod.forEach(imprimir);
		
		prod.forEach(p -> System.out.printf("Nome: %s"
				+ "\nPreco: %.2f"
				+ "\nDesconto: %.0f%%\n",p.nome, p.preco, p.desconto*100));
		
		
	}
}
