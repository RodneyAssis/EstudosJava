package estruturadecontrole;

public class EstruturaContinue {
	public static void main(String[] args) {
		// continue; ele interrompe a proxima interação diferente do break que interrompe o laço 
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) continue;
			System.out.println(i);
		}
	}
}
