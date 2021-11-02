package ParteI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Participante {

	private String nombre;
	private String apellido;
	private int edad;
	private List<String> generosMusicalesPreferentes;
	private List<String> idiomas;
	private List<String> instrumentos;
	
	public Participante(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.generosMusicalesPreferentes = new ArrayList<>();
		this.idiomas = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
	}
	
	public boolean tieneIdioma(String idioma) {
		return idiomas.contains(idioma);
	}
	
	public boolean tieneGeneroMusical(String genero) {
		return generosMusicalesPreferentes.contains(genero);
	}
	
	public boolean tieneInstrumento(String instrumento) {
		return instrumentos.contains(instrumento);
	}
	public List<String> getInstrumentos(){
		List<String> copia = new ArrayList<>();
		this.instrumentos.forEach((i) -> copia.add(i));
		return copia;
	}
	
	public List<String> getIdiomas(){
		List<String> copia = new ArrayList<>();
		this.idiomas.forEach((i) -> copia.add(i));
		return copia;
	}
	
	public List<String> getGenerosMusicales(){
		List<String> copia = new ArrayList<>();
		this.generosMusicalesPreferentes.forEach((i) -> copia.add(i));
		return copia;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}
	
	public void addIdioma(String idioma) {
		if(!tieneIdioma(idioma))
			idiomas.add(idioma);
	}
	
	public void addInstrumentos(String instrumento) {
		if(!tieneInstrumento(instrumento))
			instrumentos.add(instrumento);
	}
	
	public void addGeneroMusical(String genero) {
		if(!tieneGeneroMusical(genero))
			generosMusicalesPreferentes.add(genero);
	}
	
	public boolean cumpleCriterio(Criterio c) {
		return c.cumple(this);
	}
	
	
	
}
