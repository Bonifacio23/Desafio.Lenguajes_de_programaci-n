package Clases;

public class Persona {
	private String nomb,apell;
	private int edad, dni;
	public Persona(String nomb, String apell, int edad, int dni) {
		this.nomb = nomb;
		this.apell = apell;
		this.edad = edad;
		this.dni = dni;
	}
	public String getNombre() {
		return nomb;
	}
	public void setNombre(String nomb) {
		this.nomb = nomb;
	}
	public String getApell() {
		return apell;
	}
	public void setApell(String apell) {
		this.apell = apell;
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
