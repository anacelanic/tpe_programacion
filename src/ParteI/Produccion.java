package ParteI;

import java.util.ArrayList;
import java.util.List;

public class Produccion {
	
	/*En el reality participan un conjunto de coaches, que a su vez juegan el rol de
	jurados, y un conjunto de participantes.*/	 //---> El listado de participantes lo tiene cada Jurado/Coach
	
	/*La producción también almacena un
	conjunto de temas musicales que pueden ser cantados durante el reality.*/
	
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
	
	/*Listado de participantes que cumplen criterio de busqueda*/
	public List<ParticipanteAbstracto> participantesCumplen(Criterio c) {
		List<ParticipanteAbstracto> result = new ArrayList<>();
		for (Coach coach : coaches) {
			result.addAll(coach.obtenerParticipantesQue(c));
		}
		return result;
	}

}
