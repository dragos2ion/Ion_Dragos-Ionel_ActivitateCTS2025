package cts.cristea.razvan.grupa1115.builder.classes;

import cts.cristea.razvan.grupa1115.builder.enumerations.ETipMaterial;
import cts.cristea.razvan.grupa1115.builder.enumerations.ETipPantof;

import java.util.List;

public abstract class APantof {
    protected ETipPantof tipPantof;
    protected int nrPantof;
    protected float dimensiuneToc;
    protected ETipMaterial material;
    protected List<ETipMaterial> materialeSuplimentare;
    protected List<String> listaMesajeText;

    public abstract float calculPret();

    protected abstract void addMesaj(String mesaj); // era publica inainte dar nu era bine

    protected abstract void addMaterial(ETipMaterial tipMaterial); // era publica inainte dar nu era bine
}