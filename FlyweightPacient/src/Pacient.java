public class Pacient {
	private String nume;
	private String numarDeTelefon;
	private String adresa;

	public Pacient(String nume, String numarDeTelefon, String adresa) {
		super();
		this.nume = nume;
		this.numarDeTelefon = numarDeTelefon;
		this.adresa = adresa;
	}

	public String getNume() {
		return nume;
	}

	public String getNumarDeTelefon() {
		return numarDeTelefon;
	}

	public String getAdresa() {
		return adresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pacient [nume=").append(nume).append(", numarDeTelefon=").append(numarDeTelefon)
				.append(", adresa=").append(adresa).append("]");
		return builder.toString();
	}

}
