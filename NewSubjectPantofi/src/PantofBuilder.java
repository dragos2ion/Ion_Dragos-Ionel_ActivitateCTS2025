import java.util.ArrayList;
import java.util.List;

public class PantofBuilder implements Builder{
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
        this.materialeSuplimentare = new ArrayList<>();
        this.listaMesajeText = new ArrayList<>();
    }

    public PantofBuilder setMaterialeSuplimentare(ETipMaterial materialeSuplimentare) {
        this.materialeSuplimentare.add(materialeSuplimentare);
        return this;
    }

    public PantofBuilder setListaMesajeText(String listaMesajeText) {
        this.listaMesajeText.add(listaMesajeText);
        return this;
    }

    @Override
    public Pantof build() {
        Pantof m = null;

        if(this.nrPantof < 35 || this.nrPantof > 45){
            System.out.println("Nr pantof trebuie sa fie intre 35 si 45");
        }
        m = new Pantof(tipPantof, nrPantof, dimensiuneToc, material);


        return m;
    }
}
