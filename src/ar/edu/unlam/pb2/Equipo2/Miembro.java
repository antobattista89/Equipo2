package ar.edu.unlam.pb2.Equipo2;

public abstract class Miembro {

	private Integer nombre;
	private Integer apellido;
	private String equipo;
	
	public Miembro(Integer nombre, Integer apellido, String equipo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.equipo = equipo;
	}
	
	public Integer getNombre() {
		return nombre;
	}

	public void setNombre(Integer nombre) {
		this.nombre = nombre;
	}

	public Integer getApellido() {
		return apellido;
	}

	public void setApellido(Integer apellido) {
		this.apellido = apellido;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	public abstract String getTipo();
}
