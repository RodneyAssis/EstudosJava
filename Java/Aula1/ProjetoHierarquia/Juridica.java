package ProjetoHierarquia;

public class Juridica extends Pessoa {

	private String cnpj;
	private String escestadual;
	private String escmunicipal;
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEscestadual() {
		return escestadual;
	}
	public void setEscestadual(String escestadual) {
		this.escestadual = escestadual;
	}
	public String getEscmunicipal() {
		return escmunicipal;
	}
	public void setEscmunicipal(String escmunicipal) {
		this.escmunicipal = escmunicipal;
	}

	
}
