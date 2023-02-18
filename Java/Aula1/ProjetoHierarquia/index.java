package ProjetoHierarquia;

import java.util.ArrayList;
import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		int Tipo;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		
		ArrayList<Fisica> ListFisica = new ArrayList<>();
		ArrayList<Juridica> ListJuridica = new ArrayList<>();
		
		while(true) {
			System.out.println("Voc� � uma pessoa:\n"
					+ "1. F�sica\n"
					+ "2. Juridica\n"
					+ "3. Relatorio das Pessoas F�sica\n"
					+ "4. Relatorio das Pessoas Juridicas\n"
					+ "5. Sair\n");
			Tipo = input.nextInt();
			
			if (Tipo == 1) {
				Fisica pfisica = new Fisica();
				
				System.out.print("Digite seu nome: ");
				pfisica.setNome(input.next());
				System.out.print("Digite seu endere�o: ");
				pfisica.setEndereco(input.next());
				System.out.print("Digite o n�mero do seu telefone: ");
				pfisica.setTelefone(input.next());
				
				System.out.print("Digite seu CPF: ");
				pfisica.setCpf(input.next());
				System.out.print("Digite seu RG: ");
				pfisica.setRg(input.nextInt());
				System.out.print("Digite Sua data de nascimento: ");
				pfisica.setDatanasc(input.nextInt());
				ListFisica.add(pfisica);
			
			}
			
			
			if (Tipo == 2) {
				Juridica pjuridica = new Juridica();
				
				System.out.print("Digite seu nome: ");
				pjuridica.setNome(input.next());
				System.out.print("Digite seu endere�o: ");
				pjuridica.setEndereco(input.next());
				System.out.print("Digite o n�mero do seu telefone: ");
				pjuridica.setTelefone(input.next());
				
				System.out.print("Digite o seu CNPJ ou de sua Empresa: ");
				pjuridica.setCnpj(input.next());
				System.out.print("Digite o n�mero de inscri��o da"
						+ " escritura estadual");
				pjuridica.setEscestadual(input.next());
				System.out.print("Digite o n�mero de inscri��o da"
						+ " escritura municipal");
				pjuridica.setEscmunicipal(input.next());
				ListJuridica.add(pjuridica);
				
			}
			
			if (Tipo == 3) {
				for (Fisica i: ListFisica) {
					System.out.println("\nNome: " + i.getNome()
					+ "\nEndere�o: " + i.getEndereco()
					+ "\nTelefone: " + i.getTelefone()
					+ "\nCPF: " + i.getCpf()
					+ "\nRG: " + i.getRg()
					+ "\nData de nascimento: " + i.getDatanasc() + "\n");
				}
			}
			if (Tipo == 4) {
				for (Juridica j: ListJuridica) {
					System.out.println("\nNome: " + j.getNome()
					+ "\nEndere�o: " + j.getEndereco()
					+ "\nTelefone: " + j.getTelefone()
					+ "\nCNPJ: " + j.getCnpj()
					+ "\nEscritura Estadual: " + j.getEscestadual()
					+ "\nEscritura Municipal: " + j.getEscmunicipal() + "\n");
				}
			}
		
			if (Tipo == 5) {
				break;
			}
		}
	}
}
