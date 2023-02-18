package fundamentos.introducao;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		//com final a variavel nao podera ser alterada, se tornando uma constante
		final double pi = 3.14159;
		
		//System.out.println((raio * 2) * pi);
		// erro aplicado quando alterou pi para 2 pi = 2;
		double area = pi * (raio * raio);
		System.out.println("area da circunferencia é igual a: " + area + "m2");
	}
}
