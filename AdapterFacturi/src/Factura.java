import java.util.List;

public class Factura {
	private Integer nr;
	private final String furnizor = "S.C. Restaurant S.R.L.";
	private String cumparator;
	private List<String> produse;

	public Factura(Integer nr, String cumparator, List<String> produse) {
		super();
		this.nr = nr;
		this.cumparator = cumparator;
		this.produse = produse;
	}

	public Integer getNr() {
		return nr;
	}

	public void setNr(Integer nr) {
		this.nr = nr;
	}

	public String getCumparator() {
		return cumparator;
	}

	public void setCumparator(String cumparator) {
		this.cumparator = cumparator;
	}

	public List<String> getProduse() {
		return produse;
	}

	public void setProduse(List<String> produse) {
		this.produse = produse;
	}

	public String getFurnizor() {
		return furnizor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Factura [nr=").append(nr).append(", furnizor=").append(furnizor).append(", cumparator=")
				.append(cumparator).append(", produse=").append(produse).append("]");
		return builder.toString();
	}

}
