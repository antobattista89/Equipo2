package ar.edu.unlam.pb2.Equipo2;

public class Dt extends Miembro{

	public Dt(Integer nombre, Integer apellido, String equipo) {
		super(nombre, apellido, equipo);
		
	}

	@Override
	public String getTipo() {
		return "Dt";
	}

}
