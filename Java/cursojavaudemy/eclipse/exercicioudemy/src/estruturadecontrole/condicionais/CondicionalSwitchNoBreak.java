package estruturadecontrole.condicionais;


public class CondicionalSwitchNoBreak {
	public static void main(String[] args) {

		int idade = 13;
		
		
		switch (idade) {	
		case 25:
			System.out.println("Você é fazer coisas grandes");

		case 20:
			System.out.println("Você começa a trabalhar");
		
		case 15:
			System.out.println("Você se apaixona");

		case 10:
			System.out.println("Você conhece novos amigos");
		
		case 5:
			System.out.println("Você vai pra escola");
		
		case 0:
			System.out.println("Você existe");
		
		}
		
	}
}
