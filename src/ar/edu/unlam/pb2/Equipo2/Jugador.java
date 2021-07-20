package ar.edu.unlam.pb2.Equipo2;

public class Jugador extends Miembro{

	private Integer numeroCamiseta;
	private String posicion;
	private Integer dni;
	
	public Jugador(Integer dni, Integer nombre, Integer apellido, String equipo) {
		super(nombre, apellido, equipo);
		this.numeroCamiseta=numeroCamiseta;
		this.posicion=posicion;
		this.dni=dni;
	}

	public Integer getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(Integer numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public String getTipo() {
		return "Jugador";
	}
}
