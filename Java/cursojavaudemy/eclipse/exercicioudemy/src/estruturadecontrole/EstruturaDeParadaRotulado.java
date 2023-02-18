package estruturadecontrole;

public class EstruturaDeParadaRotulado {
	public static void main(String[] args) {
		
		// estrutura não recomendada
		externo: for (int i = 0; i < 3; i++) { // nomeando o laço
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break externo;
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
	}
}
