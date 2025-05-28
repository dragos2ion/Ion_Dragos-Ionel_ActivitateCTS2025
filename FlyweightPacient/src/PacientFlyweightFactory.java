import java.util.HashMap;
import java.util.Map;

public class PacientFlyweightFactory {
	private Map<String, Pacient> colectiePacienti = new HashMap<>();

	public Pacient getPacient(Pacient pacientInternat) {
		Pacient pacient = colectiePacienti.get(pacientInternat.getNume());
		if (pacient == null) {
			pacient = new Pacient(pacientInternat.getNume(), pacientInternat.getNumarDeTelefon(),
					pacientInternat.getAdresa());
			colectiePacienti.put(pacientInternat.getNume(), pacient);
		}
		return pacient;
	}

	public Map<String, Pacient> getColectiePacienti() {
		return colectiePacienti;
	}

}
