package APS1UNID;

public class Consulta extends Paciente {

	private String horaconsulta, statusconsulta;
	private int dataconsulta, valorconsulta;
	private Boolean consultaretorno;
	
	public String getHoraconsulta() {
		return horaconsulta;
	}
	public void setHoraconsulta(String horaconsulta) {
		this.horaconsulta = horaconsulta;
	}
	public String getStatusconsulta() {
		return statusconsulta;
	}
	public void setStatusconsulta(String statusconsulta) {
		this.statusconsulta = statusconsulta;
	}
	public int getDataconsulta() {
		return dataconsulta;
	}
	public void setDataconsulta(int dataconsulta) {
		this.dataconsulta = dataconsulta;
	}
	public int getValorconsulta() {
		return valorconsulta;
	}
	public void setValorconsulta(int valorconsulta) {
		this.valorconsulta = valorconsulta;
	}
	public Boolean getConsultaretorno() {
		return consultaretorno;
	}
	public void setConsultaretorno(Boolean consultaretorno) {
		this.consultaretorno = consultaretorno;
	}
	
	
}
