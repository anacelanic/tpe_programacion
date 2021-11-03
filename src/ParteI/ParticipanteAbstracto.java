package ParteI;

import java.util.List;

public abstract class ParticipanteAbstracto {
	
	protected String nombre;

	public ParticipanteAbstracto(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double getEdad();
	
	public abstract List<String> getGenerosMusicales();
	
	public abstract boolean tieneGeneroMusical(String genero);
	
	public abstract boolean tieneInstrumento(String instrumento);
	
	public abstract boolean tieneIdioma(String idioma);
	
	public abstract List<String> getIdiomas();
	
	public abstract List<String> getInstrumentos();
	
	public abstract List<ParticipanteAbstracto> cumpleCriterio(Criterio c);
	
	public abstract boolean puedeInterpretarTema(Cancion c);

}
