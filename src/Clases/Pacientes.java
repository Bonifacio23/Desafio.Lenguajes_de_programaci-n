package Clases;

public class Pacientes {
	
	private String nombre,caso, día, hora;
	private int edad, dni;
	private double pago;
	
	public Pacientes(String nombre, String caso, int edad, int dni, String hora, String día, double pago) {
		this.nombre = nombre;
		this.caso = caso;
		this.edad = edad;
		this.dni = dni;
		this.hora = hora;
		this.día = día;
		this.pago = pago;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDía() {
		return día;
	}
	public void setDía(String día) {
		this.día = día;
	}
	public String getCaso() {
		return caso;
	}
	public void setCaso(String caso) {
		this.caso = caso;
	}

	public double getPago() {
		return pago;
	}

	public void setPago(double pago) {
		this.pago = pago;
	}
	
	
	
	




}
