public abstract class ADecorator extends AClient {
	protected AClient clientDecorat;

	public ADecorator(AClient clientDecorat) {
		super();
		this.clientDecorat = clientDecorat;
	}

	@Override
	public void achitaNota(Float valoareNota) {
		clientDecorat.achitaNota(valoareNota);
	}

}
