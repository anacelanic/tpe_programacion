package ParteI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Participante extends ParticipanteAbstracto {
	/*De los participantes, se registra su
	nombre, apellido, edad, géneros musicales de preferencia, idiomas en los que
	canta y los instrumentos que toca.*/

	private String apellido;
	private double edad;
	private List<String> generosMusicalesPreferentes;
	private List<String> idiomas;
	private List<String> instrumentos;
	
	public Participante(String nombre, String apellido, double edad) {
		super(nombre);
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

	public double getEdad() {
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
	
	public List<ParticipanteAbstracto> cumpleCriterio(Criterio c){
		List<ParticipanteAbstracto> result = new ArrayList<>();
		if(c.cumple(this)) 
			result.add(this);
		return result;
	}

	@Override
	public boolean puedeInterpretarTema(Cancion c) {
		//return c.aceptaInterprete(this);
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Participante that = (Participante) o;
			return super.equals(that) && getApellido().equals(that.getApellido());
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
}
