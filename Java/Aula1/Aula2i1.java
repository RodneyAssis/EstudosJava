import java.util.Scanner;

public class Aula2i1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nummaca = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de ma�as que deseja comprar: ");
		int numunid = nummaca.nextInt();
		
		if (numunid <= 12) {
			System.out.println("Valor das ma�as p/unid: 0,30 " + 
				"\nQtd de ma�as compradas: " + numunid);
			System.out.println("Valor total: " + (numunid*0.30));
			nummaca.close();
		} else {
			System.out.println("Valor das ma�as p/unid: 0,25 " + 
					"\nQtd de ma�as compradas: " + numunid);
			System.out.println("Valor total: " + (numunid*0.25));
		}
		
		
							
	}

}
