package ar.edu.unlam.pb2.Equipo2;

public class Gol {
	
	private Integer minuto;
	private Jugador jugador;
	
	public Gol(Integer minuto, Jugador jugador) {
		this.minuto = minuto;
		this.jugador = jugador;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
}
