

import java.util.ArrayList;
import java.util.List;

public class Receptionist implements p06_facade.IReceptionist {
	private static Receptionist instance;
	/**
	 * 0 - masa libera; 1 - masa libera si debarasata; 2 - masa libera, debarasata
	 * si cu servetele noi pe ea; 3 - masa ocupata.
	 */

	private static final Integer nrMese = 10;
	private List<Integer> meseDisponibile;

	private Receptionist() {
		super();
		this.meseDisponibile = new ArrayList<>();
		for (int i = 0; i < nrMese; i++) {
			this.meseDisponibile.add(2);
		}
	}

	public void ocupaMasa(Integer nrMasa) {
		if (this.meseDisponibile.get(nrMasa) == 2) {
			this.meseDisponibile.set(nrMasa, 3);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	public void elibereazaMasa(Integer nrMasa) {
		if (this.meseDisponibile.get(nrMasa) == 3) {
			this.meseDisponibile.set(nrMasa, 0);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	public void debaraseazaMasa(Integer nrMasa) {
		if (this.meseDisponibile.get(nrMasa) == 0) {
			this.meseDisponibile.set(nrMasa, 1);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	public void puneServeteleNoiPeMasa(Integer nrMasa) {
		if (this.meseDisponibile.get(nrMasa) == 1) {
			this.meseDisponibile.set(nrMasa, 2);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public Boolean verificaDisponibilitateMasa(Integer nrMasa) {
		return this.meseDisponibile.get(nrMasa) < 3; // 0, 1, 2
	}

	@Override
	public Boolean verificaMasaDebarasata(Integer nrMasa) {
		return this.meseDisponibile.get(nrMasa) == 1 || this.meseDisponibile.get(nrMasa) == 2;
	}

	@Override
	public Boolean verificaServetele(Integer nrMasa) {
		return this.meseDisponibile.get(nrMasa) == 2;
	}

	public static Receptionist getInstance() {
		if (instance == null) {
			instance = new Receptionist();
		}
		return instance;
	}

}
