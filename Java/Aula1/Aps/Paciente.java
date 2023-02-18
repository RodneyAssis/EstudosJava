package Aps;

public class Paciente extends Medico {

	private String cpfpac, nomepac;
	private int datanascimento, datacadastro;
	
	public String getCpfpac() {
		return cpfpac;
	}
	public void setCpfpac(String cpfpac) {
		this.cpfpac = cpfpac;
	}
	public String getNomepac() {
		return nomepac;
	}
	public void setNomepac(String nomepac) {
		this.nomepac = nomepac;
	}
	public int getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(int datanascimento) {
		this.datanascimento = datanascimento;
	}
	public int getDatacadastro() {
		return datacadastro;
	}
	public void setDatacadastro(int datacadastro) {
		this.datacadastro = datacadastro;
	}
	
	
}