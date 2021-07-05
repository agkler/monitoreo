package ar.edu.unlam.pb2;


public class Auto extends Vehiculo {

	private String patente;
	private Integer cantMaxPasajeros;
	private Integer velocidadMaxima;

	public Auto(String patente, Integer cantMaxPasajeros, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente=patente;
		this.cantMaxPasajeros=cantMaxPasajeros;
		this.velocidadMaxima=velocidadMaxima;
	}

	public String getPatente() {
		// TODO Auto-generated method stub
		return this.patente;
	}

	public Integer getCantidadMaximaDePasajeros() {
		// TODO Auto-generated method stub
		return this.cantMaxPasajeros;
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
