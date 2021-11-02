package ParteI;

import java.util.ArrayList;
import java.util.List;

public class Coach {
	
	protected String nombre;
	protected List<Participante> equipo;

	public Coach(String nombre) {
		this.nombre = nombre;
		this.equipo = new ArrayList<>();
	}
	
	public boolean tieneParticipante(Participante p) {
		return equipo.contains(p);
	}
	
	public void addParticipante(Participante p) {
		if(!tieneParticipante(p))
			equipo.add(p);
	}
	
	public List<String> obtenerInstrumentosEquipo() {
		List<String> result = new ArrayList<>();
		for (Participante participante : equipo) {
			List<String> resultParcial = participante.getInstrumentos();
			for (String instrumento : resultParcial) {
				if(!result.contains(instrumento))
					result.add(instrumento);
			}
		}
		return result;
	}
	
	public List<String> obtenerIdiomasEquipo() {
		List<String> result = new ArrayList<>();
		for (Participante participante : equipo) {
			List<String> resultParcial = participante.getIdiomas();
			for (String idioma : resultParcial) {
				if(!result.contains(idioma))
					result.add(idioma);
			}
		}
		return result;
	}
	
	public List<String> obtenerGenerosMusicalesEquipo() {
		List<String> result = new ArrayList<>();
		for (Participante participante : equipo) {
			List<String> resultParcial = participante.getGenerosMusicales();
			for (String genero : resultParcial) {
				if(!result.contains(genero))
					result.add(genero);
			}
		}
		return result;
	}
	
	public int obtenerEdadPromedioEquipo() {
		int result = 0;
		for (Participante participante : equipo) {
			result += participante.getEdad();
		}
		return result / equipo.size();
	}
	
	public List<Participante> obtenerParticipantesQue(Criterio c) {
		List<Participante> result = new ArrayList<>();
		for (Participante p : equipo) {
			if(p.cumpleCriterio(c))
				result.add(p);
		}
		return result;		
	}

}
