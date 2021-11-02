package ParteI;

public class CriterioGenero extends Criterio {
	
	private String genero;

	public CriterioGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public boolean cumple(Participante p) {
		return p.tieneGeneroMusical(genero);
	}

}
