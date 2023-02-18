package Aula2;
import java.util.Scanner;

public class Aula2i2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String test = "";
		while (test.equals("SAIR"));{
			
			Scanner Alunos = new Scanner(System.in);
			System.out.println("Para finalizar digite sair"
					+ "\nDigite o nome do aluno: ");
			String Aluno = Alunos.next();
			test += Aluno;
			
			Scanner Nota1 = new Scanner(System.in);
			System.out.println("Digite a nota da primeira Unidade: ");
			double NotaI = Nota1.nextDouble();
			
			Scanner Nota2 = new Scanner(System.in);
			System.out.println("Digite a nota de segunda Unidade: ");
			double NotaII = Nota2.nextDouble();
			
			double media = (NotaI+NotaII)/2;
			
			if (media >= 6) {
				System.out.println("Aluno: " + Aluno 
						+ "\nNota 1: " + NotaI
						+ "\nNota 2: " + NotaII
						+ "\nMedia" + media
						+ "\nAprovado!");
			} else {
				System.out.println("Aluno: " + Aluno 
						+ "\nNota 1: " + NotaI
						+ "\nNota 2: " + NotaII
						+ "\nMedia: " + media
						+ "\nReprovado!");
			}
		}

	}

}
