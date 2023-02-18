/*
Programa em Java para solucionar o problema abaixo:
Voc� possui um tio que est� iniciando a carreira de m�dico com um pequeno
consult�rio. Ele pediu sua ajuda para auxilia-lo com a cria��o de um programa
simples para controlar suas consultas m�dicas e as consultas m�dicas dos seus
s�cios. Utilizando os conceitos de Programa��o Orientada a Objetos e ArrayList,
implemente esse sistema, o qual dever� contar com os requisitos abaixo:

O programa dever� ter um menu para que o usu�rio possa navegar entre as
op��es abaixo:
� Cadastro de M�dicos (0,2)
� Cadastro de Pacientes (0,2)
� Cadastro de Consultas (0,3)
� Cancelamento de Consultas M�dicas (filtro por CPF + Data + CRM) (0,3)
� Relat�rio de Consultas Agendadas (filtro por data e CRM) (0,2)
� Relat�rio Financeiro (lista de consultas e valores (filtro por Data), com
impress�o do valor total) (0,3)
*/

package APS1UNID;
import java.util.ArrayList;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		ArrayList<Medico> ListMedico = new ArrayList<>();
		ArrayList<Paciente> ListPaciente = new ArrayList<Paciente>();
		ArrayList<Consulta> ListConsulta = new ArrayList<Consulta>();
		
		
		int opcao;
		
		while(true) {
			
			System.out.println("\nEscolha a op��o desejada:"
					+ "\n1.Cadastrar M�dico"
					+ "\n2.Cadastrar Paci�nte"
					+ "\n3.Cadastrar Consultar"
					+ "\n4.Cancelar Consulta M�dica"
					+ "\n5.Relat�rio de Consultas Agendadas"
					+ "\n6.Relat�rio Financeiro"
					+ "\n\n");
			opcao = input.nextInt();
			
			if (opcao == 1) {
				Medico medic = new Medico();
				System.out.print("Digite o CPF do m�dico: ");
				medic.setCpfmed(input.next());
				System.out.print("Digite o CRM do m�dico: ");
				medic.setCrm(input.next());
				System.out.print("Digite o nome do m�dico: ");
				medic.setNomemed(input.next());
				System.out.print("Digite data de nascimento: ");
				medic.setDatanascimento(input.nextInt());
				ListMedico.add(medic);
				System.out.print("\nM�dico cadastrado com sucesso!\n");
			}
			
			if (opcao == 2) {
				Paciente paciente = new Paciente();
				System.out.print("Digite o CPF do paci�nte: ");
				paciente.setCpfpac(input.next());
				System.out.print("Digite o nome do peci�nte: ");
				paciente.setNomepac(input.next());
				System.out.print("Digite data de nascimento: ");
				paciente.setDatanascimento(input.nextInt());
				System.out.print("Digite data de cadastro: ");
				paciente.setDatacadastro(input.nextInt());
				ListPaciente.add(paciente);
				System.out.print("\nPaci�nte cadastrado com sucesso!\n");
			}
			
			if (opcao == 3) {
				Consulta consulta = new Consulta();
				System.out.print("Digite a data que ser� realizada a consulta: ");
				consulta.setDataconsulta(input.nextInt());
				System.out.println("Digite o horario ser� realizado a consulta: ");
				consulta.setHoraconsulta(input.next());
				System.out.println("Digite CRM do m�dico: ");
				consulta.setCrm(input.next());
				System.out.println("Digite do CPF do paci�nte: ");
				consulta.setCpfpac(input.next());
				ListConsulta.add(consulta);
			
			}
		}
		
	}

}
