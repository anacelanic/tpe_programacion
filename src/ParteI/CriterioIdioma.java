package ParteI;

public class CriterioIdioma extends Criterio {
	
	private String idioma;
	
	public CriterioIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public boolean cumple(Participante p) {
		return p.tieneIdioma(idioma);
	}

}
