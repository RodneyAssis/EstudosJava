package fundamentos.tiposprimitivoseobjetos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações de um funcionario
		
		//Tipos Numericos
		byte anosdeempresa =23;
		short numdevoos = 32232;
		int id = 12345;
		//long pontosacumulados = 3_121_013_123; //apartir de um de 2352130123 já ultrapassara para um literal de valor long para reconherecer coloque o L depois do atributo
		long pontosacumulados = 3_121_013_123L;
			
		//Tipos numericos reais
		//float salario = 11_445.44; // literal double para reconhecer teque adicionar um F depois do atributo
		float salario1 = 11_445.44F;
		double vendasacumuladas = 2_991_797_100.1;
	
		//Tipos booleanos
		boolean estadeferias = false; // true
		
		//Tipo Caracteres
		char status = 'a'; //ativo
		
		//dias de empresa
		System.out.println(anosdeempresa * 365);
		//numero de viagens
		System.out.println(numdevoos/2);
		//pontos por real
		System.out.println(pontosacumulados/vendasacumuladas);
	
		System.out.println(id + " ganha: " + salario1);
		System.out.println("Ferias? " + estadeferias);
		System.out.println("Status: " + status);
	}
}
