import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		Factura factura1 = new Factura(1, "Cumparator1",
				Arrays.asList(new String[] { "Produs1", "Produs2", "Produs3", "Produs4" }));
		Factura factura2 = new Factura(2, "Cumparator2",
				Arrays.asList(new String[] { "Produs5", "Produs6", "Produs7", "Produs8" }));
		Factura factura3 = new Factura(3, "Cumparator3",
				Arrays.asList(new String[] { "Produs9", "Produs10", "Produs11", "Produs12" }));

		List<Factura> facturi = new ArrayList<>();
		facturi.add(factura1);
		facturi.add(factura2);
		facturi.add(factura3);

		ISoftPrintareFacturiNou softPrintareFacturiNou = new SoftPrintareFacturiNou(facturi);
		softPrintareFacturiNou.printeazaFacturi();

		System.out.println();
		ISoftPrintareFacturiNou softPrintareFacturiNou2 = new AdaptorSoftPrintareFacturi(facturi);
		softPrintareFacturiNou2.printeazaFacturi();

	}
}
