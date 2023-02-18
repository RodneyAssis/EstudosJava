package fundamentos;

import java.util.Scanner;

public class TipoStringIquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String ("2");
		
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner input = new Scanner(System.in);
		
		String s2 = input.next(); // remove os espaços já o .nextline() mantem o resultado igual
		System.out.println("2" == s2);
		System.out.println("2" == s2.trim()); // remove os espaços
		System.out.println("2".equals(s2)); // compara com o conteudo da String
		
		input.close();
	}
}
