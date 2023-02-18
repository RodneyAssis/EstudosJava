/*
Programa em Java para solucionar o problema abaixo:
Você possui um tio que está iniciando a carreira de médico com um pequeno
consultório. Ele pediu sua ajuda para auxilia-lo com a criação de um programa
simples para controlar suas consultas médicas e as consultas médicas dos seus
sócios. Utilizando os conceitos de Programação Orientada a Objetos e ArrayList,
implemente esse sistema, o qual deverá contar com os requisitos abaixo:

O programa deverá ter um menu para que o usuário possa navegar entre as
opções abaixo:
• Cadastro de Médicos (0,2)
• Cadastro de Pacientes (0,2)
• Cadastro de Consultas (0,3)
• Cancelamento de Consultas Médicas (filtro por CPF + Data + CRM) (0,3)
• Relatório de Consultas Agendadas (filtro por data e CRM) (0,2)
• Relatório Financeiro (lista de consultas e valores (filtro por Data), com
impressão do valor total) (0,3)
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
			
			System.out.println("\nEscolha a opção desejada:"
					+ "\n1.Cadastrar Médico"
					+ "\n2.Cadastrar Paciênte"
					+ "\n3.Cadastrar Consultar"
					+ "\n4.Cancelar Consulta Médica"
					+ "\n5.Relatório de Consultas Agendadas"
					+ "\n6.Relatório Financeiro"
					+ "\n\n");
			opcao = input.nextInt();
			
			if (opcao == 1) {
				Medico medic = new Medico();
				System.out.print("Digite o CPF do médico: ");
				medic.setCpfmed(input.next());
				System.out.print("Digite o CRM do médico: ");
				medic.setCrm(input.next());
				System.out.print("Digite o nome do médico: ");
				medic.setNomemed(input.next());
				System.out.print("Digite data de nascimento: ");
				medic.setDatanascimento(input.nextInt());
				ListMedico.add(medic);
				System.out.print("\nMédico cadastrado com sucesso!\n");
			}
			
			if (opcao == 2) {
				Paciente paciente = new Paciente();
				System.out.print("Digite o CPF do paciênte: ");
				paciente.setCpfpac(input.next());
				System.out.print("Digite o nome do peciênte: ");
				paciente.setNomepac(input.next());
				System.out.print("Digite data de nascimento: ");
				paciente.setDatanascimento(input.nextInt());
				System.out.print("Digite data de cadastro: ");
				paciente.setDatacadastro(input.nextInt());
				ListPaciente.add(paciente);
				System.out.print("\nPaciênte cadastrado com sucesso!\n");
			}
			
			if (opcao == 3) {
				Consulta consulta = new Consulta();
				System.out.print("Digite a data que será realizada a consulta: ");
				consulta.setDataconsulta(input.nextInt());
				System.out.println("Digite o horario será realizado a consulta: ");
				consulta.setHoraconsulta(input.next());
				System.out.println("Digite CRM do médico: ");
				consulta.setCrm(input.next());
				System.out.println("Digite do CPF do paciênte: ");
				consulta.setCpfpac(input.next());
				ListConsulta.add(consulta);
			
			}
		}
		
	}

}
