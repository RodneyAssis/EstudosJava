package estruturadecontrole.condicionais;

public class DesafioIF {
	public static void main(String[] args) {
		// Desafio Por que ao executar o bloco de codigo aparece sendo que nota é menor
		// que 9?
		// Resposta: Após a condicional ele encerrou o if com ; ou seja o bloco entre as
		// chaves não esta na condicional

		// Comando para formatar o codigo ctrl + shit + f
		double nota = 1.3;

		if (nota >= 9.0)
		// ; -- Erro do codigo
		{
			System.out.println("Quadro de honta");
			System.out.println("Você é fera");
		}

	}
}
