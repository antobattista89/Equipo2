package ar.edu.unlam.pb2.Equipo2;

import java.util.Set;

public class Partido {
	
	private Set<Jugador>local;
	private Set<Jugador>visitante;
	private Integer numeroPartido;
	
	public Partido(Integer numeroPartido, Set<Jugador> visitante, Set<Jugador> local) {
		this.local = local;
		this.visitante = visitante;
		this.numeroPartido = numeroPartido;
	}

	public Set<Jugador> getLocal() {
		return local;
	}

	public void setLocal(Set<Jugador> local) {
		this.local = local;
	}

	public Set<Jugador> getVisitante() {
		return visitante;
	}

	public void setVisitante(Set<Jugador> visitante) {
		this.visitante = visitante;
	}

	public Integer getNumeroPartido() {
		return numeroPartido;
	}

	public void setNumeroPartido(Integer numeroPartido) {
		this.numeroPartido = numeroPartido;
	}	
}
