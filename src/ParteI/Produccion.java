package ParteI;

import java.util.ArrayList;
import java.util.List;

public class Produccion {
	
	private List<Cancion> canciones;
	private List<Coach> coaches;
	
	public Produccion() {
		this.coaches = new ArrayList<>();
		this.canciones = new ArrayList<>();
	}
	
	public boolean tieneTema(Cancion c) {
		return canciones.contains(c);
	}
	
	public boolean tieneCoach(Coach c) {
		return coaches.contains(c);
	}
	
	public void addTemaMusical(Cancion c) {
		if(!tieneTema(c))
			canciones.add(c);
	}
	
	public void addCoach(Coach c) {
		if(!tieneCoach(c))
			coaches.add(c);
	}
	
	public List<Participante> participantesCumplen(Criterio c) {
		List<Participante> result = new ArrayList<>();
		for (Coach coach : coaches) {
			result.addAll(coach.obtenerParticipantesQue(c));
		}
		return result;
	}

}
