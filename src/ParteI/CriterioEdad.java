package ParteI;

public class CriterioEdad extends Criterio {
	
	private int edad;

	public CriterioEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean cumple(Participante p) {
		return p.getEdad() > edad;
	}

}
