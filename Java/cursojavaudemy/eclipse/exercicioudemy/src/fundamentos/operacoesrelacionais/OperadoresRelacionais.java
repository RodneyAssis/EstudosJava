package fundamentos.operacoesrelacionais;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		//coisas estranhas
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);// em categoria hexadecimal x097 é representado por a
		
		System.out.println(3 >= 3);
		
		
		double nota = 8;
		boolean bomComportamento = true;
		boolean passouPorMedia =  nota >= 7;
		
		boolean temDesconto = bomComportamento == true && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
	}
}
