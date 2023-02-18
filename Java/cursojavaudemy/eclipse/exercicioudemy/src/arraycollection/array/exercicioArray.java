package arraycollection.array;

import java.util.Arrays;

public class exercicioArray {
	public static void main(String[] args) {
		double[] notasAluno = new double[3];
		double total = 0;
		System.out.println(Arrays.toString(notasAluno));
		notasAluno[0] = 7.2;
		notasAluno[1] = 4;
		notasAluno[2] = 6.2;
		
		System.out.println(notasAluno);
		System.out.println(Arrays.toString(notasAluno));
		
		for (int i = 0; i < notasAluno.length; i++) {
			System.out.println(notasAluno[i]);
			total += notasAluno[i];
			
		}
		
		
		//acessando a ultima nota de aluno
		System.out.println(notasAluno[notasAluno.length-1]);
		System.out.println("media " + total/notasAluno.length);
		
		//outra forma de abrir um array
		
		double b = 5;
		double[] notasAlunoB = {2,2,b,2,2};//moh ruim
		double totalB = 0;
		System.out.println(Arrays.toString(notasAlunoB));

		
		System.out.println(notasAlunoB);
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			System.out.println(notasAlunoB[i]);
			totalB += notasAlunoB[i];
			
		}
		
		System.out.println("media " + totalB/notasAlunoB.length);
	}
}
