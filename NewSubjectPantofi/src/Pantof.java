import java.util.ArrayList;
import java.util.List;

public class Pantof extends APantof{

     Pantof(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material) {
        this.tipPantof = tipPantof;
        this.nrPantof = nrPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.material = material;
        materialeSuplimentare = new ArrayList<>();
        listaMesajeText = new ArrayList<>();
    }

    @Override
    public float calculPret() {
        return 0;
    }

    @Override
    public void addMesaj(String mesaj) {
        this.listaMesajeText.add(mesaj);
    }

    @Override
    public void addMaterial(ETipMaterial tipMaterial) {
        this.materialeSuplimentare.add(tipMaterial);
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tipPantof=" + tipPantof +
                ", nrPantof=" + nrPantof +
                ", dimensiuneToc=" + dimensiuneToc +
                ", material=" + material +
                ", materialeSuplimentare=" + materialeSuplimentare +
                ", listaMesajeText=" + listaMesajeText +
                "} " + super.toString();
    }
}
