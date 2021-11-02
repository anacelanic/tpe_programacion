package ParteI;

public class CoachExigente extends Coach {

	public CoachExigente(String nombre) {
		super(nombre);
	}
	
	public void addParticipante(Participante p, Criterio c) { //pasamos el Criterio por parametro 
															  //pq la restricci�n cambia en timpo de ejecuci�n
		if(!tieneParticipante(p) && c.cumple(p))
			equipo.add(p);
	}

}
