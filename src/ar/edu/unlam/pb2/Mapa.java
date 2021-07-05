package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Mapa {

	private String nombre;
	private ArrayList<Vehiculo> vehiculos;

	public Mapa(String nombre) {
		this.nombre=nombre;
		vehiculos= new ArrayList<Vehiculo>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void agregarVehiculo(Vehiculo nuevo) {
		vehiculos.add(nuevo);
		
	}

	public Integer getCantidadDeVehiculos() {
		return vehiculos.size();
	}

	public Boolean hayCoalición() throws ColitionException{
		
	
		return false;
	}


	

	


	

	
}
