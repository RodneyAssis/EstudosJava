package funcoeslambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		UnaryOperator<Integer> maisUm = num -> num + 2;
		UnaryOperator<Integer> vezesUm = num -> num * 2;
		UnaryOperator<Integer> aoQuadrado = num -> num * num;
//		UnaryOperator<Integer> maisUm = num -> num + 2;
		
		System.out.println(maisUm.andThen(vezesUm).andThen(aoQuadrado).apply(5));
		
		// 5 + 2 = 7 * 2 = 14 * 14 = 196
	}
}
