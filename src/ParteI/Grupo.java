package ParteI;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends ParticipanteAbstracto {
	
	/*Una banda o grupo posee un nombre, y
	una edad .*/
	
	private List<ParticipanteAbstracto> participantes;

	public Grupo(String nombre) {
		super(nombre);
		this.participantes = new ArrayList<>();
	}

	/*Se calcula como el promedio de las edades de cada uno de sus miembros*/
	@Override
	public double getEdad() {
		double result = 0;
		if (participantes.size()!= 0) {
			for (ParticipanteAbstracto p : participantes) {
				result += p.getEdad();
			}
			result = result / participantes.size();
		}
		return result;
	}

	/*Los géneros de preferencia se calculan como la
	intersección de los géneros de preferencia de todos sus miembros.*/
	/*@Override --- Version Ana----
	public List<String> getGenerosMusicales() {
		List<String> result = new ArrayList<>();
		for (ParticipanteAbstracto p : participantes) {
			List<String> resultParcial = p.getGenerosMusicales();
			for (String genero : resultParcial) {
				if(p.tieneGeneroMusical(genero))
					result.add(genero);
			}	
		}
		return result;
	}*/
	
	
	/*------- Version Lucho --------*/
	
	@Override
	public List<String> getGenerosMusicales() {
		List<String> listaTemporal = new ArrayList<>();
		for (ParticipanteAbstracto participante : participantes) { 
			for (String genero : participante.getGenerosMusicales()) {
				if (!listaTemporal.contains(genero))
					listaTemporal.add(genero); //Por cada participante llena la lista tempral de generos sin repetidos
			}
		}
		for (Sring generoTemporal : listaTempral) {
			for (ParticipanteAbstracto participante : participantes) {
				if (!participante.tieneGeneroMusical(generoTemporal)) {
					listaTemporal.remove(generoTemporal); //Quita el genero que no estuvo en el paticipante
					break; 	//Rompe el for del participante donde esta y continua con el siguiente generoTemporal
				}
			}
		}
		return listaTemporal;
	}
	

	@Override
	public boolean tieneGeneroMusical(String genero) {
		for (ParticipanteAbstracto p : participantes) {
			if(!p.tieneGeneroMusical(genero))
				return false;
		}
		return true;
	}
	
	
	/*En el caso de los
	idiomas que pueden interpretar una banda o grupo se considera la unión
	de los idiomas de todos sus miembros (no pueden existir repetidos), lo
	mismo ocurre para los instrumentos que puede tocar una banda.*/
	@Override
	public List<String> getIdiomas() {
		List<String> result = new ArrayList<>();
		for (ParticipanteAbstracto p : participantes) {
			List<String> resultParcial = p.getIdiomas();
			for (String idioma : resultParcial) {
				if(!result.contains(idioma))
					result.add(idioma);
			}	
		}
		return result;
	}
	
	
	/*---------- Version Lucho ---------------*/
//	@Override
//	public List<String> getIdiomas(){
//		List<String> listaTemporal = new ArrayList<>();
//		for (ParticipanteAbstracto participante : participantes) {
//			for (String idioma : participante.getIdiomas())
//				if (!listaTemporal.contains(idioma))
//					listaTemporal.add(idioma);
//		}
//		for (String idiomaTemporal : listaTemporal) {
//			for (ParticipanteAbstracto participante : participantes)
//				if (!participante.tieneIdioma(idiomaTemporal)) {
//					listaTemporal.remove(idiomaTemporal);
//					break;
//				}
//		}
//		return listaTemporal;		
//	}
	
	

	@Override
	public List<String> getInstrumentos() {
		List<String> result = new ArrayList<>();
		for (ParticipanteAbstracto p : participantes) {
			List<String> resultParcial = p.getInstrumentos();
			for (String instrumento : resultParcial) {
				if(!result.contains(instrumento))
					result.add(instrumento);
			}	
		}
		return result;
	}

	@Override
	public List<ParticipanteAbstracto> cumpleCriterio(Criterio c) {
		List<ParticipanteAbstracto> result = new ArrayList<>();
		if(c.cumple(this)) { //para el punto 1 de busquedas, esta bien?
			result.add(this); 
			return result;
		}
		for (ParticipanteAbstracto p : participantes) {
				result.addAll(p.cumpleCriterio(c));
		}
		return result;
	}

	@Override
	public boolean tieneInstrumento(String instrumento) {
		for (ParticipanteAbstracto p : participantes) {
			if(!p.tieneInstrumento(instrumento))
				return false;
		}
		return true;
	}

	@Override
	public boolean tieneIdioma(String idioma) {
		for (ParticipanteAbstracto p : participantes) {
			if(!p.tieneIdioma(idioma))
				return false;
		}
		return true;
	}

	@Override
	public boolean puedeInterpretarTema(Cancion c) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
