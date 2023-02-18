package fundamentos.operacoesaritmeticas;

public class DesafioOperadoresAritmeticos {
	public static void main(String[] args) {
		//requisito
		//Para debugar aperte o inseto a perte f6 para avançar
		int num1 = (int) Math.pow((6*(3+2)), 2); 
		int div1 = (3*2); 
		
		int funcao1 = num1/div1;
		
		int funcao2 = (int) Math.pow((((1 - 5) * (2 - 7)) / 2), 2);
		
		int somall = (int) Math.pow((funcao1 - funcao2), 3);
		
		int div2 = (int) Math.pow(10, 3);
		
		System.out.println("O resultado é: " + somall/div2);
				
	}
}