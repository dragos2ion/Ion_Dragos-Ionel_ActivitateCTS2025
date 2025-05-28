public class Internare implements IInternare {
	private Salon salon;

	public Internare(Salon salon) {
		super();
		this.salon = salon;
	}

	public Salon getSalon() {
		return salon;
	}

	@Override
	public void interneazaPacient(Pacient pacient) {
		System.out.println("Pacientul " + pacient + " a fost internat.");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Internare [salon=").append(salon).append("]");
		return builder.toString();
	}

}
