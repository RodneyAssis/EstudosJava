package fundamentos.operacoesaritmeticas;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		System.out.println(2 + 2.2);
		
		var x = 2.2 + 1.5;
		double y = 3.56;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
		int a = 2;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);
		
		//operador modulo - resto da divisão
		System.out.println(a%b);
		System.out.println(8%3);
	}
}
