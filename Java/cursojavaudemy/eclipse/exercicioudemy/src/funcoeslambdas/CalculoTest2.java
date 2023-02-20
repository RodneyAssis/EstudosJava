package funcoeslambdas;

public class CalculoTest2 {
	public static void main(String[] args) {
		// funcao lambda
		// se na inteface possui 2 parametros a soma deve possui 2 variaveis
		Calculo soma = (a, b) -> {return a + b;};
	
		System.out.println(soma.executa(2, 3));
		
		// caso não defina o corpo será executado porem não pode chamar o return
		soma = (a, b) -> a*b;
		
		System.out.println(soma.executa(3, 3));
	}
}
