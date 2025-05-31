import java.util.List;

public class AdaptorSoftPrintareFacturi extends SoftPrintareFacturiExistent implements ISoftPrintareFacturiNou {
	private List<Factura> facturi;

	public AdaptorSoftPrintareFacturi(List<Factura> facturi) {
		super();
		this.facturi = facturi;
	}

	@Override
	public void printeazaFacturi() {
		this.printeazaFacturi(this.facturi);
	}

}
