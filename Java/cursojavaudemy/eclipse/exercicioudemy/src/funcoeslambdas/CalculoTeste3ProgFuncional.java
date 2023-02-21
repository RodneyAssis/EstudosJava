package funcoeslambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3ProgFuncional {
	public static void main(String[] args) {
		BinaryOperator<Double> calc = (x, y) -> x + y;

		// não é permitido conversão direta
		// double >> int não pode
		// double >> Double pode
//		System.out.println(calc.apply(2, 4));
		System.out.println(calc.apply(2.0, 4.0));
		
		BinaryOperator<Integer> calc2 = (x, y) -> x + y;
		
		System.out.println(calc2.apply(2, 4));


	}
}
