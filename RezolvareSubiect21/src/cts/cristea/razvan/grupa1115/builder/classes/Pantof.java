package cts.cristea.razvan.grupa1115.builder.classes;

import cts.cristea.razvan.grupa1115.builder.enumerations.ETipMaterial;
import cts.cristea.razvan.grupa1115.builder.enumerations.ETipPantof;

import java.util.ArrayList;

public class Pantof extends APantof {

    Pantof(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial tipMaterial) {
        this.tipPantof = tipPantof;
        this.nrPantof = nrPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.material = tipMaterial;
        materialeSuplimentare = new ArrayList<>();
        listaMesajeText = new ArrayList<>();
    }

    @Override
    public float calculPret() {
        return 2 + nrPantof * dimensiuneToc;
    }

    @Override
    protected void addMesaj(String mesaj) {
        listaMesajeText.add(mesaj);
    }

    @Override
    protected void addMaterial(ETipMaterial tipMaterial) {
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
                '}';
    }
}