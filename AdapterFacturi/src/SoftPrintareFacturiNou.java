import java.util.List;

public class SoftPrintareFacturiNou implements ISoftPrintareFacturiNou {
	private List<Factura> facturi;

	public SoftPrintareFacturiNou(List<Factura> facturi) {
		super();
		this.facturi = facturi;
	}

	@Override
	public void printeazaFacturi() {
		System.out.println("Soft printare facturi nou");
		for (Factura factura : facturi) {
			System.out.println(factura);
		}
	}

}
