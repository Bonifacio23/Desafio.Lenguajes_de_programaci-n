package Clases;

public class Pacientes extends Persona{
	
	private String caso, día, hora;
	private double pago;
	private String medico;
	private String espec;
	private String consul;
	public Pacientes(String nomb, String apell, int edad, int dni, String caso, String día, String hora, double pago,
			String medico, String espec, String consul) {
		super(nomb, apell, edad, dni);
		this.caso = caso;
		this.día = día;
		this.hora = hora;
		this.pago = pago;
		this.medico = medico;
		this.espec = espec;
		this.consul = consul;
	}
	public String getCaso() {
		return caso;
	}
	public void setCaso(String caso) {
		this.caso = caso;
	}
	public String getDía() {
		return día;
	}
	public void setDía(String día) {
		this.día = día;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public double getPago() {
		return pago;
	}
	public void setPago(double pago) {
		this.pago = pago;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}
	public String getEspec() {
		return espec;
	}
	public void setEspec(String espec) {
		this.espec = espec;
	}
	public String getConsul() {
		return consul;
	}
	public void setConsul(String consul) {
		this.consul = consul;
	}
	


	

	
}
