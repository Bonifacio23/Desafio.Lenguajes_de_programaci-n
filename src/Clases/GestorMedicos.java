package Clases;

import java.util.ArrayList;

public class GestorMedicos {

	public static ArrayList<Medico> medicos = new ArrayList<>();

	static {
		medicos.add(new Medico("Jorge", "Fernández Salas", 42, 45678912, "Medicina General", "Consultorio 101"));
		medicos.add(new Medico("Patricia", "Ramírez Osorio", 38, 47123568, "Medicina General", "Consultorio 102"));
		medicos.add(new Medico("Miguel", "Torres Bazán", 50, 48956234, "Medicina General", "Consultorio 103"));
		medicos.add(new Medico("Gonzalo Javier", "Quispe Benítez", 40, 35829305, "Pediatría", "Consultorio A102"));
		medicos.add(new Medico("Diego Alejandro", "Fernández Vargas", 40, 45395835, "Traumatología", "Consultorio B201"));
		medicos.add(new Medico("Beto Luis", "García Mendoza", 40,74852913, "Cardiología", "Consultorio B202"));
		medicos.add(new Medico("Rodrigo Juan", "Salazar Rodríguez", 40, 38491248, "Odontología", "Consultorio C301"));
		medicos.add(new Medico("Mateo Sebastián", "Morales Paredes", 40, 41249538, "Oftalmología", "Consultorio C302"));
		
	}
	}


