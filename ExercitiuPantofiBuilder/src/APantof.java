import java.util.List;

public abstract class APantof {
	protected ETipPantof tipPantof;
	protected int nrPantof;
	protected float dimensiuneToc;
	protected ETipMaterial material;
	protected List<ETipMaterial> materialeSuplimentare;
	protected List<String> listaMesajeText;

	public APantof(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material, List<ETipMaterial> materialeSuplimentare, List<String> listaMesajeText) {
		this.tipPantof = tipPantof;
		this.nrPantof = nrPantof;
		this.dimensiuneToc = dimensiuneToc;
		this.material = material;
		this.materialeSuplimentare = materialeSuplimentare;
		this.listaMesajeText = listaMesajeText;
	}

	public abstract float calculPret();
	public abstract void addMesaj(String mesaj);
	public abstract void addMaterial(ETipMaterial tipMaterial);
}
