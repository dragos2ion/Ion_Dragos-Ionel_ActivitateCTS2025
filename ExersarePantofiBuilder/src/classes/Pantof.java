package classes;

import enumerations.ETipMaterial;
import enumerations.ETipPantof;

import java.util.ArrayList;

public class Pantof extends APantof{


    Pantof(ETipPantof tipPantof, ETipMaterial tipMaterial, int nrPantof, float dimensiuneToc){
        this.tipPantof = tipPantof;
        this.material = tipMaterial;
        this.nrPantof = nrPantof;
        this.dimensiuneToc = dimensiuneToc;
        materialeSuplimentare = new ArrayList<>();
        listaMesajeText = new ArrayList<>();
    }

    @Override
    public float calculPret() {
        return 0;
    }

    @Override
    public void addMesaj(String mesaj) {
        listaMesajeText.add(mesaj);
    }


    @Override
    public void addMaterial(ETipMaterial tipMaterial)  {
        materialeSuplimentare.add(tipMaterial);
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
