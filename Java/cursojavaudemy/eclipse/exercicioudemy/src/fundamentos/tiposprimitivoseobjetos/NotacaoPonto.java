package fundamentos.tiposprimitivoseobjetos;

public class NotacaoPonto {
	public static void main(String[] args) {
		//double a = 2.3;
		String s = "vkdsdkono x";
		s = s.toUpperCase()
			 .replace("X", "minha senhora")
			 .concat("!!!");
		/*
		s = s.replace("X", "minha senhora");
		s = s.concat("!!!");
		*/
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia x".replace("x", "minha tia");
		System.out.println(y);
		
		//tipos primitivos não tem o operador .
		int b = 3;
		System.out.println(b);
	}

}
