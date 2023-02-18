package estruturadecontrole.repeticao;


public class RepeticaoFor {
	public static void main(String[] args) {
		// estrutura for é mais adequada para estruturas limitadas onde possui um fim
		// bom dia x10
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Bom dia " + i);
		}
		int x = 2;
		
		for(; x < 10;) { // porra feia do carai
			System.out.println("bom dia");
			x++;
		}
		
		/*
		for(;;) { //laço infinito
			System.out.println(bom dia);
		}
		 */
	}
}
