package funcoeslambdas;

public class CalculoTeste {
	public static void main(String[] args) {
	
		Calculo calculo = new Soma();
		System.out.println(calculo.executa(2, 3));
		
		calculo = new Multiplicacao();
		System.out.println(calculo.executa(2, 3));
		
	}
}
