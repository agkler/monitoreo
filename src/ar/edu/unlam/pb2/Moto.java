package ar.edu.unlam.pb2;

public class Moto extends Vehiculo {
	private String patente;
	private Integer velocidadMaxima;
	
	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente=patente;
		this.velocidadMaxima=velocidadMaxima;
	}
	
	public String getPatente() {
		// TODO Auto-generated method stub
		return this.patente;
	}

	public Integer getVelocidadMaxima() {
		// TODO Auto-generated method stub
		return this.velocidadMaxima;
	}

	public Double getLatitud() {
		// TODO Auto-generated method stub
		return this.latitud;
	}

	public Double getLongitud() {
		// TODO Auto-generated method stub
		return this.longitud;
	}


}
