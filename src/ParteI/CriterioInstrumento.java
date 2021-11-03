package ParteI;

public class CriterioInstrumento extends Criterio {
	
	private String instrumento;

	public CriterioInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}

	@Override
	public boolean cumple(ParticipanteAbstracto p) {
		return p.tieneInstrumento(instrumento);
	}

}
