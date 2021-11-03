package ParteI;

import java.util.List;

public abstract class ParticipanteAbstracto {
	
	protected String nombre;

	public ParticipanteAbstracto(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
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

	public boolean equals(Object o) {
		try {
			ParticipanteAbstracto that = (ParticipanteAbstracto) o;
			return getNombre().equals(that.getNombre());
		} catch (Exception e) {
			return false;
		}
	}
}
