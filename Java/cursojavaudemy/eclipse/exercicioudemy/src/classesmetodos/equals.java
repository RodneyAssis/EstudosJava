package classesmetodos;

import java.util.Date;

public class equals {
	public static void main(String[] args) {
		equalsUsuario u1 = new equalsUsuario();
		u1.nome = "josé carlos";
		u1.email = "pedro@gmail.com";
		equalsUsuario u2 = new equalsUsuario();
		u2.nome = "josé carlos";
		u2.email = "pedro@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		System.out.println(u2.equals(u1));
		
		
		System.out.println(u1.equals(u1));
		
		System.out.println(u2.equals(new Date()));
	}
}
