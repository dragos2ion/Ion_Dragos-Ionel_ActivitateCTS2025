package classes;


import enumerations.ETipMaterial;
import enumerations.ETipPantof;
import interfaces.Builder;

import java.util.List;

public class PantofBuilder implements Builder {
        private Pantof pantof;

    public PantofBuilder(ETipPantof tipPantof, int nrPantof, float dimensiuneToc, ETipMaterial material) {
        this.pantof = new Pantof(tipPantof, material, nrPantof, dimensiuneToc);
    }



    @Override
    public Pantof build() throws Exception {
        if(pantof.nrPantof < 35 || pantof.nrPantof > 45){
            throw new Exception("Numar pantof nu se afla in intervalul 35 - 45");
        }

        if(pantof.dimensiuneToc < 0.5f || pantof.dimensiuneToc > 12.5f){
            throw new Exception("Dimensiune tocului nu se afla in interval 0.5 - 12.5");
        }

        if(pantof.tipPantof == ETipPantof.GHETE && pantof.materialeSuplimentare.size() > 3){
            throw new Exception("Nu se pot da mai multe specificatii suplimentare pentru balerini\nNu se pot da mai multe specificatii suplimentare pentru balerini\n");
        }



        return this.pantof;
    }
}
