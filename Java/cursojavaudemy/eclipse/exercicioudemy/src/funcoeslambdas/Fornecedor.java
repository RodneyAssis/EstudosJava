package funcoeslambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		// negocio meio estranho preciso estudar
		Supplier<List<String>> lista = () -> Arrays.asList("Ana", "jeo");
		
		System.out.println(lista.get());
	}
}
