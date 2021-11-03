package ParteI;

public class CriterioGenero extends Criterio {
	
	private String genero;

	public CriterioGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public boolean cumple(ParticipanteAbstracto p) {
		return p.tieneGeneroMusical(genero);
	}

}
