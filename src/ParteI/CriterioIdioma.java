package ParteI;

public class CriterioIdioma extends Criterio {
	
	private String idioma;
	
	public CriterioIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public boolean cumple(ParticipanteAbstracto p) {
		return p.tieneIdioma(idioma);
	}

}
