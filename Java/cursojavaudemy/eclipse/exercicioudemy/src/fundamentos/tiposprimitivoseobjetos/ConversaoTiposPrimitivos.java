package fundamentos.tiposprimitivoseobjetos;

public class ConversaoTiposPrimitivos {
	public static void main(String[] args) {
		
		//evitar usar cast;
		// conversão dos tipos numericas
		
		double d = 1.123456789789; //implicita
		System.out.println(d);
		
		float f = (float) 2.1234567897989; //explicita (CAST)
		System.out.println(f);
		
		int c = 4;
		byte b = (byte) c; //explicita (CAST)
		System.out.println(b);
		
		double e = 1.6; 
		int i = (int) e; // não arredonda 
		System.out.println(i);
		
		
		//conversão dos tipos strings
		
		//conversão de numero para string
		Integer num1 = 10000;
		
		System.out.println(num1.toString().length());
	
		int num2 = 20000;
		
		System.out.println(Integer.toString(num2).length());
		
		//forma gabiarrada
		System.out.println(("" + num2).length());
			}
}
