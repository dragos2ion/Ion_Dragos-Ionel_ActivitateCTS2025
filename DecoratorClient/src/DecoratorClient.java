public class DecoratorClient extends ADecorator {
	private static Integer numarClientiCareAchitaNotaMin;

	public DecoratorClient(AClient clientDecorat) {
		super(clientDecorat);
		numarClientiCareAchitaNotaMin = 0;
	}

	@Override
	public void achitaNota(Float valoareNota) {
		if (valoareNota >= 100) {
			numarClientiCareAchitaNotaMin++;
		}
		if (numarClientiCareAchitaNotaMin != 0 && numarClientiCareAchitaNotaMin % 5 == 0) {
			System.out.println("Clientul a primit un discount de 10% din nota.");
			valoareNota = (float) (0.9 * valoareNota);
		}
		this.clientDecorat.achitaNota(valoareNota);
	}

}
