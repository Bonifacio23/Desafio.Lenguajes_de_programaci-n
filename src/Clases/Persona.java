package Clases;

public class Persona {
	private String nomb;
	private int edad, dni;
	public Persona(String nomb, int edad, int dni) {
		this.nomb = nomb;
		this.edad = edad;
		this.dni = dni;
	}
	public String getNombre() {
		return nomb;
	}
	public void setNombre(String nomb) {
		this.nomb = nomb;
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
	

}
