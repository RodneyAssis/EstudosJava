package classesmetodos;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a;
		
		a++;
		b--; // atribuição por valor (Tipo primitivo)
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1,2,1998);
		
		Data d2 = d1;
		
		d1.dia = 12;
		d1.mes = 1;
		d1.ano = 1223;
		
		System.out.println(d1.obterDataFormtada());
		System.out.println(d2.obterDataFormtada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormtada());
		System.out.println(d2.obterDataFormtada());
		
		
		int c = 4;
		obterAprimoramento(c);
		System.out.println(c);
		
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 11;
		d.ano = 1111;
		// metodos staticos a objetos geram impacto
	}
	
	static void obterAprimoramento(int a) {
		a++;
	}
	
	
}
