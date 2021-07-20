package ar.edu.unlam.pb2.Equipo2;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.Equipo2.PartidoNoEncontradoExeption;

public class Torneo {

	private String nombre;
	private Set<Miembro> participantes;
	private Set<Partido> partidos;
	
	
	public Torneo(String nombre, Set<Miembro> participantes, Set<Partido> partidos) {
		this.nombre = nombre;
		this.participantes =new HashSet<>();
		this.partidos = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Boolean registrarMiembro(Miembro miembro) {
		return this.participantes.add(miembro);
	}
	
	public void crearPartido(Integer numeroPartido, String equipoLocal, String equipoVisitante) {
		
		Set<Jugador> nominaLocal = obtenerJugadores(equipoLocal);
		Set<Jugador> nominaVisitante = obtenerJugadores(equipoVisitante);
		
		Partido partido = new Partido(numeroPartido,nominaLocal,nominaVisitante);
		this.partidos.add(partido);		
		
	}

	private Set<Jugador> obtenerJugadores(String nombreEquipo)
	{
		Set<Jugador> jugadores = new HashSet<>();
		for(Miembro miembro : participantes) {
			if(miembro.getTipo().equals("Jugador") && miembro.getEquipo().equals(nombreEquipo)) {
				jugadores.add((Jugador) miembro);
			}
		}
		
		return jugadores;
	}
	
	public void registrarGol(Integer numeroPartido, Integer numeroCamiseta, String Equipo, Integer minuto) throws PartidoNoEncontradoExeption {
		Partido partido = buscarPartidoPorNumero(numeroPartido);
		
	}

	private Partido buscarPartidoPorNumero(Integer numeroPartido) throws PartidoNoEncontradoExeption{
		for(Partido partido : this.partidos)
			if(partido.getNumeroPartido().equals(numeroPartido)) {
				return partido;
			}
		throw new PartidoNoEncontradoExeption();
	}
	
}
