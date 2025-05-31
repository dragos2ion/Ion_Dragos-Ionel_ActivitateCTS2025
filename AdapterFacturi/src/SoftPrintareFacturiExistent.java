import java.util.List;

public class SoftPrintareFacturiExistent implements ISoftPrintareFacturiExistent {

	@Override
	public void printeazaFacturi(List<Factura> facturi) {
		System.out.println("Soft printare facturi existent");
		for (Factura factura : facturi) {
			System.out.println(factura);
		}
	}

}
