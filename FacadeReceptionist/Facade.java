package p06_facade;

public class Facade {

	public static Boolean verificaMasa(Integer nrMasa) {
		Receptionist receptionist = Receptionist.getInstance();
		return receptionist.verificaDisponibilitateMasa(nrMasa) && receptionist.verificaMasaDebarasata(nrMasa)
				&& receptionist.verificaServetele(nrMasa);
	}
}
