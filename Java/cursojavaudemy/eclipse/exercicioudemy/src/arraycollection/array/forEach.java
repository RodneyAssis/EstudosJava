package arraycollection.array;

public class forEach {
	public static void main(String[] args) {
		double[] Notas = {9,7,6,5,4,7,0};
		
		//forma de percorrer o Array
		//padrao
		for (int i = 0; i < Notas.length; i++) {
			System.out.println(Notas[i]);
		}
		System.out.println();
		//foreach
		for (double d : Notas) {
			System.out.println(d);
		}
	}
	
	
}
