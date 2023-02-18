package fundamentos.introducao;

public class DesafioCalcTemp {
	public static void main(String[] args) {
		double F = 150;
		final double Cel = (F - 32) * 5 / 9.0;
		final double Far = (Cel * 9 / 5.0) + 32;
		
		System.out.println("Valor de Farenheit " + F + " para Celcius: " + Cel);
		System.out.println("Valor de Celcius " + Cel + " para Farenreit: " + Far);
	}
}
