package ParteI;

import java.util.ArrayList;
import java.util.List;

public class Cancion {
	
	private String titulo;
	private String idioma;
	private List<String> generosPertenecientes;
	private List<String> instrumentosInterpretacion;
	
	public Cancion(String titulo, String idioma) {
		this.titulo = titulo;
		this.idioma = idioma;
		this.generosPertenecientes = new ArrayList<>();
		this.instrumentosInterpretacion = new ArrayList<>();
	}
	
	public void addInstrumentos(String instrumento) {
		if(!instrumentosInterpretacion.contains(instrumento))
			instrumentosInterpretacion.add(instrumento);
	}
	
	public void addGeneroMusical(String genero) {
		if(!generosPertenecientes.contains(genero))
			generosPertenecientes.add(genero);
	}

	
}