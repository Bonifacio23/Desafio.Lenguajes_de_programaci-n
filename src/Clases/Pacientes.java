package Clases;

public class Pacientes extends Persona{
	
	private String caso, día, hora;
	private double pago;
	public Pacientes(String nomb, int edad, int dni, String caso, String día, String hora, double pago) {
		super(nomb, edad, dni);
		this.caso = caso;
		this.día = día;
		this.hora = hora;
		this.pago = pago;
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


	

	
}
