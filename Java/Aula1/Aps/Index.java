/*


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

package Aps;

import java.util.ArrayList;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		ArrayList<Medico> ListMedico = new ArrayList<>();
		ArrayList<Paciente> ListPaciente = new ArrayList<Paciente>();
		ArrayList<Consulta> ListConsulta = new ArrayList<Consulta>();

		int opcao = 20;

		while (opcao != 0) {

			System.out.print("\nEscolha a opção desejada:" 
					+ "\n1.Cadastrar Médico" 
					+ "\n2.Cadastrar Paciênte"
					+ "\n3.Cadastrar Consultar" 
					+ "\n4.Cancelar Consulta Médica"
					+ "\n5.Relatório de Consultas Agendadas" 
					+ "\n6.Relatório Financeiro"
					+ "\n0.Finalizar\n" 
					+ "\nEscolha uma das alternativas: ");
			opcao = input.nextInt();

			switch (opcao) {
			case 1: {
				Medico medic = new Medico();
				System.out.print("\nDigite o CPF do médico: ");
				medic.setCpfmed(input.next());
				System.out.print("Digite o CRM do médico: ");
				medic.setCrm(input.next());
				System.out.print("Digite o nome do médico: ");
				medic.setNomemed(input.next());
				System.out.print("Digite data de nascimento: ");
				medic.setDatanascimento(input.nextInt());
				ListMedico.add(medic);
				System.out.print("\nMédico cadastrado com sucesso!\n");
				break;

			}

			case 2: {
				Paciente paciente = new Paciente();
				System.out.print("\nDigite o CPF do paciênte: ");
				paciente.setCpfpac(input.next());
				System.out.print("Digite o nome do peciênte: ");
				paciente.setNomepac(input.next());
				System.out.print("Digite data de nascimento: ");
				paciente.setDatanascimento(input.nextInt());
				System.out.print("Digite data de cadastro: ");
				paciente.setDatacadastro(input.nextInt());
				ListPaciente.add(paciente);
				System.out.print("\nPaciênte cadastrado com sucesso!\n");
				break;
			}

			case 3: {
				Consulta consulta = new Consulta();
				System.out.print("\nDigite a data que será realizada a consulta: ");
				consulta.setDataconsulta(input.nextInt());
				System.out.print("Digite o horario será realizado a consulta: ");
				consulta.setHoraconsulta(input.next());
				System.out.print("Digite CRM do médico: ");
				consulta.setCrm(input.next());
				System.out.print("Digite do CPF do paciênte: ");
				consulta.setCpfpac(input.next());
				System.out.print("A consulta é de retorno? \n(true ou false): ");
				consulta.setStatusconsulta("Agendada");
				consulta.setConsultaretorno(input.nextBoolean());
				if (consulta.getConsultaretorno() == true) {
					consulta.setValorconsulta(0.0);
				} else if (consulta.getConsultaretorno() == false) {
					consulta.setValorconsulta(280.0);
				}
				System.out.println("Consulta cadastrada com sucesso!");
				ListConsulta.add(consulta);
				break;
			}

			case 4: {
				System.out.print("\nDigite seu CPF: ");
				String stts = input.next();
				for (Consulta stattus : ListConsulta) {
					if (stts.equals(stattus.getCpfpac())) {
						stattus.setStatusconsulta("Cancelada");
						break;
					}
				}
				break;
			}

			case 5: {
				System.out.print("\nDigite a data da consulta:");
				int dataAnalise = input.nextInt();
				System.out.print("Digite o CRM do medico: ");
				String crmAnalise = input.next();
				for (Consulta relatorio : ListConsulta) {
					if (dataAnalise == relatorio.getDataconsulta() 
							& crmAnalise.equals(relatorio.getCrm())
							& relatorio.getStatusconsulta().equals("Agendada"))
					{
						System.out.println("\nData da consulta: " 
					+ relatorio.getDataconsulta());
						System.out.println("Horario da consulta: " 
					+ relatorio.getHoraconsulta());
						System.out.println("CRM do medico: " 
					+ relatorio.getCrm());
						System.out.println("CPF do paciente: " 
					+ relatorio.getCpfpac());
						System.out.println("Valor da consulta: " 
					+ relatorio.getValorconsulta());
						break;
					}
				}
				break;
			}

			case 6: {
				System.out.print("\nDigite a data da consulta:");
				int dataFinanceiro = input.nextInt();
				for (Consulta financeiro : ListConsulta) {
					if (dataFinanceiro == financeiro.getDataconsulta()) {
						System.out.print("\nData: " + 
								financeiro.getDataconsulta() + "\n");
						System.out.print("Valor da consulta: " + 
								financeiro.getValorconsulta() + "\n");
					}
				}
			}
			
			case 0:{
				System.out.println("\nFIM");
			}

			default:
				System.out.println("\n");
			}

		}

	}

}
