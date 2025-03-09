package cts.cristea.razvan.grupa1115.builder.classes;

import cts.cristea.razvan.grupa1115.builder.enumerations.ETipMaterial;
import cts.cristea.razvan.grupa1115.builder.enumerations.ETipPantof;
import cts.cristea.razvan.grupa1115.builder.interfaces.Builder;

import java.util.List;

public class PantofBuilder implements Builder {
    private Pantof pantof;

    public PantofBuilder(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial tipMaterial) {
        this.pantof = new Pantof(tipPantof, nrPantof, dimensiuneToc, tipMaterial);
    }

    public PantofBuilder setMaterialSuplimentar(ETipMaterial materialSuplimentar) {
        pantof.addMaterial(materialSuplimentar);
        return this;
    }

    public PantofBuilder setMesajeTextSuplimentar(String mesajeTextSuplimentar) {
        pantof.addMesaj(mesajeTextSuplimentar);
        return this;
    }

    @Override
    public Pantof build() throws Exception {

        if (pantof.nrPantof < 35 || pantof.nrPantof > 45) {
            throw new Exception("Numarul unui pantof nu poate fi in afara intervalului [35, 45]\n");
        }

        if (pantof.dimensiuneToc < 0.5f || pantof.dimensiuneToc > 12.5f) {
            throw new Exception("Dimensiunea tocului nu se afla in intervalul 0.5-12.5\n");
        }

        if (pantof.tipPantof == ETipPantof.BALERINI && pantof.materialeSuplimentare.size() > 3) {
            throw new Exception("Nu se pot da mai multe specificatii suplimentare pentru balerini\n");
        }

        int sumaLungimiMesaje = 0;

        for (String mesaj : pantof.listaMesajeText) {
            sumaLungimiMesaje += mesaj.length();
        }

        if (pantof.dimensiuneToc < sumaLungimiMesaje) {
            throw new Exception("Suma lungimilor sirurilor de mesaje trebuie sa fie mai mica ca dimensiunea tocului pantofului\n");
        }

        return this.pantof;
    }
}