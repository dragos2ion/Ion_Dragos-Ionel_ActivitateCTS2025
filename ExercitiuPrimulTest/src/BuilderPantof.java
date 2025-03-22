import java.util.ArrayList;
import java.util.List;

public class BuilderPantof implements Builder {

    private ETipPantof tipPantof;
    private int nrPantof;
    private float dimensiuneToc;
    private ETipMaterial material;
    private List<ETipMaterial> materialeSuplimentare;
    private List<String> listaMesajeText;

    public BuilderPantof(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material) {
        this.tipPantof = tipPantof;
        this.nrPantof = nrPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.material = material;
        this.materialeSuplimentare = new ArrayList<>();
        this.listaMesajeText = new ArrayList<>();
    }

    public BuilderPantof setMaterialeSuplimentare(ETipMaterial materialeSuplimentare) {
        this.materialeSuplimentare.add(materialeSuplimentare);
        return this;
    }

    public BuilderPantof setListaMesajeText(String listaMesajeText) {
        this.listaMesajeText.add(listaMesajeText);
        return this;
    }

    @Override
    public Pantof build() {
        Pantof m = null;

        m = new Pantof(tipPantof, nrPantof, dimensiuneToc, material);
        for(ETipMaterial d:materialeSuplimentare){
            m.addMaterial(d);
        }

        for(String l:listaMesajeText){
            m.addMesaj(l);
        }


        return m;
    }
}
