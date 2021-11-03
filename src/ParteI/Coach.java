package ParteI;

import java.util.ArrayList;
import java.util.List;

public class Coach {
	
	protected String nombre;
	protected List<ParticipanteAbstracto> equipo;

	public Coach(String nombre) {
		this.nombre = nombre;
		this.equipo = new ArrayList<>();
	}
	
	public boolean tieneParticipante(ParticipanteAbstracto p) {
		return equipo.contains(p);
	}
	
	public void addParticipante(ParticipanteAbstracto p) {
		if(!tieneParticipante(p))
			equipo.add(p);
	}
	
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
	
	public int obtenerEdadPromedioEquipo() {
		int result = 0;
		for (ParticipanteAbstracto participante : equipo) {
			result += participante.getEdad();
		}
		return result / equipo.size();
	}
	
	public List<ParticipanteAbstracto> obtenerParticipantesQue(Criterio c) {
		List<ParticipanteAbstracto> result = new ArrayList<>();
		for (ParticipanteAbstracto p : equipo) {
			result.addAll(p.cumpleCriterio(c));
		}
		return result;		
	}

}
