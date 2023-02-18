package fundamentos.operadoresunarios;

public class OperadorTernario {
	public static void main(String[] args) {
		// operador ternario dentro do outro, porem o prof não acha viavel
		double media = 4.9;
		// variavel em estado condicional ? --> operador ternario de condicional
		// String resultadoParcial = media >= 5 ? "Em recuperação." : "Reprovado.";
		String resultadoFinal = media >= 7 ? "eprovado." : 
								media >= 5 ? "em recuperação." : "reprovado.";
		
		System.out.println("O aluno está " + resultadoFinal);
		
		//Exemplo utilizando operadores relacionais
		
		double nota = 8;
		boolean bomComportamento = true;
		boolean passouPorMedia =  nota >= 7;
		
		boolean temDesconto = bomComportamento == true && passouPorMedia;
		
		//boa utilização para remover resultados booleanos de true e false
		String resultado = temDesconto ? "Sim" : "Não";
		System.out.println("Tem desconto? " + resultado);
		
	}
}
