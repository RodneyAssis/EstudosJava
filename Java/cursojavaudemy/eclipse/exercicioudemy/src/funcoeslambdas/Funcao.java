package funcoeslambdas;

import java.util.function.Function;

public class Funcao {
public static void main(String[] args) {
	
	//É atribuido um valor e retorna uma função um possivel resultado
	Function<Integer, String> parOuImpar = nu -> nu % 2 == 0 ? "par" : "impar";

	Function<String, String> oResultado = valor -> "O resultado é " + valor;
	
	Function<String, String> algumaCoisa = valor -> valor + "!!!";
	
	var concatFunctions = parOuImpar.andThen(oResultado).andThen(algumaCoisa).apply(2);
	
	System.out.println(concatFunctions);
	
	// 2 % 2 == 0 = par -> x ;
	// "O resultado é" + x = o resultado é par -> x
	// x + "!!!" = "o resultado é par!!!"
	// Ele recebe as atribuições e resolve e aplica na proxima atribuição.
	}
}
