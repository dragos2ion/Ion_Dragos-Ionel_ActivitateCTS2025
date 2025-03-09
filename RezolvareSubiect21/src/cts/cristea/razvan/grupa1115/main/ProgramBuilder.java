package cts.cristea.razvan.grupa1115.main;

import cts.cristea.razvan.grupa1115.builder.classes.Pantof;
import cts.cristea.razvan.grupa1115.builder.classes.PantofBuilder;
import cts.cristea.razvan.grupa1115.builder.enumerations.ETipMaterial;
import cts.cristea.razvan.grupa1115.builder.enumerations.ETipPantof;

public class ProgramBuilder {
    public static void main(String[] args) throws Exception {
        PantofBuilder pantofBuilder = new PantofBuilder(ETipPantof.GHETE, 38, 11.25f, ETipMaterial.PIELE_ECOLOGICA);
        Pantof pantof = pantofBuilder.build();

        PantofBuilder pantofBuilder1 = new PantofBuilder(ETipPantof.GHETE, 38, 10.25f, ETipMaterial.PIELE_INTOARSA);
        Pantof pantof1 = pantofBuilder1.setMaterialSuplimentar(ETipMaterial.PANZA).setMesajeTextSuplimentar("Cu floricele").build();

//        PantofBuilder pantofBuilder2 = new PantofBuilder(ETipPantof.STILETTO, 38, 11.25f, ETipMaterial.PIELE_ECOLOGICA);
//        Pantof pantof2 = pantofBuilder1.setMaterialSuplimentar(ETipMaterial.PIELE_NATURALA).setMesajeTextSuplimentar("bijuterii").build();

        System.out.println(pantof);
        System.out.println(pantof1);
//        System.out.println(pantof2);
    }
}