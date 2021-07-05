package ar.edu.unlam.pb2;

public class Tren extends Vehiculo {

	private Integer cantVagones;
	private Integer pasajerosPorVagon;
	private Integer velMaxima;

	public Tren(Integer cantVagones, Integer pasajerosPorVagon, Integer velMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.cantVagones=cantVagones;
		this.pasajerosPorVagon=pasajerosPorVagon;
		this.velMaxima=velMaxima;
	}

	public Integer getCantidadDeVagones() {
		// TODO Auto-generated method stub
		return this.cantVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return pasajerosPorVagon;
	}

	public Integer getVelocidadMaxima() {
		return velMaxima;
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
