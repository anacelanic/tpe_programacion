package ParteI;

public class CriterioNot extends Criterio {
	
	private Criterio c1;

	public CriterioNot(Criterio c1) {
		this.c1 = c1;
	}

	@Override
	public boolean cumple(Participante p) {
		return !c1.cumple(p);
	}

}
