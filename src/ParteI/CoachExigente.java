package ParteI;

public class CoachExigente extends Coach {

	public CoachExigente(String nombre) {
		super(nombre);
	}
	
	public void addParticipante(Participante p, Criterio c) { //pasamos el Criterio por parametro 
															  //pq la restricción cambia en timpo de ejecución
		if(!tieneParticipante(p) && c.cumple(p))
			equipo.add(p);
	}

}
