package ParteI;

import java.util.ArrayList;
import java.util.List;

public class Grupo extends ParticipanteAbstracto {
	
	private List<ParticipanteAbstracto> participantes;

	public Grupo(String nombre) {
		super(nombre);
		this.participantes = new ArrayList<>();
	}

	@Override
	public double getEdad() {
		double result = 0;
		for (ParticipanteAbstracto p : participantes) {
			result += p.getEdad();
		}
		return result / participantes.size();
	}

	@Override
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
	}

	@Override
	public boolean tieneGeneroMusical(String genero) {
		for (ParticipanteAbstracto p : participantes) {
			if(!p.tieneGeneroMusical(genero))
				return false;
		}
		return true;
	}

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
