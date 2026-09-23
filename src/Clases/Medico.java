package Clases;

public class Medico extends Persona{
	private String espec;
	private String consul;
	public Medico(String nomb, String apell, int edad, int dni, String espec, String consul) {
		super(nomb, apell, edad, dni);
		this.espec = espec;
		this.consul = consul;
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
