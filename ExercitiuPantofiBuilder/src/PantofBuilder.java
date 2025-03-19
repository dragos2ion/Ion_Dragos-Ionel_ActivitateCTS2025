import java.util.List;

public class PantofBuilder implements IBuilder {
    private ETipPantof tipPantof;
    private int nrPantof;
    private float dimensiuneToc;
    private ETipMaterial material;
    private List<ETipMaterial> materialeSuplimentare;
    private List<String> listaMesajeText;


    public PantofBuilder(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material) {
        this.tipPantof = tipPantof;
        this.nrPantof = nrPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.material = material;
    }

    public PantofBuilder setMaterialeSuplimentare(ETipMaterial materialeSuplimentare) {
            this.materialeSuplimentare.add(materialeSuplimentare);
        return this;
    }

    public void setListaMesajeText(List<String> listaMesajeText) {
        this.listaMesajeText = listaMesajeText;
    }

    @Override
    public Pantof build() {
        Pantof m = null;


        return m;
    }
}
