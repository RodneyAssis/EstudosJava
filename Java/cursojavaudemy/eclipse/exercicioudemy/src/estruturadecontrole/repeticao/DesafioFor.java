package estruturadecontrole.repeticao;

public class DesafioFor {
	public static void main(String[] args) {
		//String valor = "#";
		//for (int i = 1; i <= 5; i++) {
		//	System.out.println(valor);
		//	valor += "#";
		//}
		//desafio
		// realizar o procedimento acima sem user valores numericos
		
		for (String i = "#"; !i.equals("#####"); i += "#") {
			System.out.println(i);
		}
	}
}
