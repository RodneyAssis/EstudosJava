package funcoeslambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		// analisa o resultado, cado seje verdadeiro retornará um valor boolean(true ou
		// false)
		
		//Recebe um valor e retorna um valor booleano;
		Predicate<Integer> isPar = num -> num % 2 == 0;
		
		//Tambem é possivel fazer mais uma composição com o predicate
		Predicate<Integer> entreCemeMil = num -> num > 100 && num < 1000;
		//Resultado de um precicate
		System.out.println(isPar.test(2));
		
		//Resultado de multiplos predicate
		// resultado x = 102 % 2 == 0 true y = 102 > 100 && 102 < 1000 == true
		// existe também outros metodos auxiliares para essa tarefa como and() ,or(), negate()
		System.out.println(isPar.and(entreCemeMil).test(102));
	}
}
