public class Salon {
	private Integer nrSalon;
	private Integer nrPat;
	private Integer nrZileSpitalizare;

	public Salon(Integer nrSalon, Integer nrPat, Integer nrZileSpitalizare) {
		super();
		this.nrSalon = nrSalon;
		this.nrPat = nrPat;
		this.nrZileSpitalizare = nrZileSpitalizare;
	}

	public Integer getNrSalon() {
		return nrSalon;
	}

	public Integer getNrPat() {
		return nrPat;
	}

	public Integer getNrZileSpitalizare() {
		return nrZileSpitalizare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Salon [nrSalon=").append(nrSalon).append(", nrPat=").append(nrPat)
				.append(", nrZileSpitalizare=").append(nrZileSpitalizare).append("]");
		return builder.toString();
	}

}
