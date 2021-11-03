package ParteI;

import java.util.ArrayList;
import java.util.List;

public class Coach {
	/*Cada coach/jurado tiene un listado de participantes asignados como equipo propio.*/
	
	public String nombre;
	public List<ParticipanteAbstracto> equipo;
	
	/*Uno de los jurados se puso exigente*/
	public Criterio comportamiento;

	public Coach(String nombre) {
		this.nombre = nombre;
		this.equipo = new ArrayList<>();
		this.comportamiento = new CriterioSiempreTrue();
	}
	
	public void setCriterioExigencia(Criterio criterio) {
		this.comportamiento = criterio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean tieneParticipante(ParticipanteAbstracto p) {
		return equipo.contains(p);
	}
	
	public void addParticipante(ParticipanteAbstracto p) {
		if(!tieneParticipante(p) && comportamiento.cumple(p))
			/*Preguntar ---> En el caso de la exigencia del jurado, se debe pasar el criterio en el AddParticipante o en el setComportamiento*/
			/*Preguntar ---> Esta bien tener una funcion que sólo haga el Contains , o utilizar el contains en el IF?*/
			equipo.add(p);
	}
	
	/*Listado de todos los instrumentos que pueden tocar los participantes de su equipo (no
		debe haber repetidos)*/
	
	public List<String> obtenerInstrumentosEquipo() {
		List<String> result = new ArrayList<>();
		for (ParticipanteAbstracto participante : equipo) {
			List<String> resultParcial = participante.getInstrumentos();
			for (String instrumento : resultParcial) {
				if(!result.contains(instrumento))
					result.add(instrumento);
			}
		}
		return result;
	}
	
	/*un listado de todos los idiomas que pueden cantar los participantes de su equipo (sin idiomas
	repetidos)*/
	
	public List<String> obtenerIdiomasEquipo() {
		List<String> result = new ArrayList<>();
		for (ParticipanteAbstracto participante : equipo) {
			List<String> resultParcial = participante.getIdiomas();
			for (String idioma : resultParcial) {
				if(!result.contains(idioma))
					result.add(idioma);
			}
		}
		return result;
	}
	
	/*un listado de géneros de preferencia de los participantes de su equipo (sin repetidos y
	ordenados alfabéticamente)*/
	
	public List<String> obtenerGenerosMusicalesEquipo() {
		List<String> result = new ArrayList<>();
		for (ParticipanteAbstracto participante : equipo) {
			List<String> resultParcial = participante.getGenerosMusicales();
			for (String genero : resultParcial) {
				if(!result.contains(genero))
					result.add(genero);
			}
		}
		return result;
	}
	
	/*El promedio de edad de su equipo*/
	
	public double obtenerEdadPromedioEquipo() {
		double result = 0;
		for (ParticipanteAbstracto participante : equipo) {
			result += participante.getEdad();
		}
		return result / equipo.size();
	}
	
	/*Listado de participantes que cumplen criterio de busqueda*/
	
	public List<ParticipanteAbstracto> obtenerParticipantesQue(Criterio c) {
		List<ParticipanteAbstracto> result = new ArrayList<>();
		for (ParticipanteAbstracto p : equipo) {
			result.addAll(p.cumpleCriterio(c));
		}
		return result;		
	}
	
	@Override
	public boolean equals(Object o) {
		try {
			Coach that = (Coach) o;
			return nombre.equals(that.getNombre());
		} catch (Exception e) {
			return false;
		}
	}

}
