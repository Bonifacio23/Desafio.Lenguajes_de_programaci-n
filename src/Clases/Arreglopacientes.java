package Clases;

import java.util.ArrayList;

public class Arreglopacientes {
private ArrayList<Pacientes>Pacienteslista;

public Arreglopacientes() {
	Pacienteslista= new ArrayList<Pacientes>();
	
	Adicionar(new Pacientes("Sergio", "Gripe", 17, 72338065, "12:20", "14/09/2026", 15.50));
	Adicionar(new Pacientes("Fernanda", "Tos", 16, 72241232, "14:16", "14/09/2026", 20));
	Adicionar(new Pacientes("Jacinto", "Asma", 23, 32441434, "22:00", "14/09/2026", 40.50));
	
}


public void Adicionar(Pacientes x) {
	Pacienteslista.add(x);

}

public int Tamaño() {
	return Pacienteslista.size();
	
}

public Pacientes Obtener(int x) {
	
return Pacienteslista.get(x);
	
}


public double IngresosTotales() {
	double suma=0.0;
	 for (int i = 0;i<Tamaño(); i++) {
		 suma+= Obtener(i).getPago();
		 
		
	}
		return suma;
	
	}

public double PromedioEdad() {
	if (Tamaño()==0) return 0;
	double suma2=0;
	for (int i = 0; i <Tamaño(); i++) {
		suma2+=Obtener(i).getEdad();
	}
	return suma2/Tamaño();
	
}


public Pacientes Buscar(int dni) {
	
	for (int i = 0; i < Tamaño(); i++) {
		if (Obtener(i).getDni()==dni) {
			return Obtener(i);
		}
	
	}
	return null;
}
public String Registro() {
	int Registro= Tamaño()+ 1;
	return String.format("04d%", Registro);
	
}
public String Registro(int i) {
    return String.format("%04d", i+1);
}



public void Eliminar(Pacientes x) {
	 Pacienteslista.remove(x);
	
}












	
	
	
	
	
	
}
	

