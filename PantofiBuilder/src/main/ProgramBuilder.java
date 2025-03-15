package main;

import classes.Pantof;
import classes.PantofBuilder;
import enumerations.ETipMaterial;
import enumerations.ETipPantof;

public class ProgramBuilder {
    public static void main(String[] args) throws Exception {
        PantofBuilder pantofBuilder = new PantofBuilder(ETipPantof.GHETE, 38, 2.0f, ETipMaterial.PIELE_ECOLOGICA);
        Pantof pantof = pantofBuilder.build();
        System.out.println(pantof); // Use the variable to avoid the warning

        PantofBuilder pantofBuilder1 = new PantofBuilder(ETipPantof.GHETE, 38, 10.25f, ETipMaterial.PIELE_INTOARSA);
        Pantof pantof1 = pantofBuilder1.setMaterialSuplimentar(ETipMaterial.PANZA)
                .setMesajeTextSuplimentar("Floricele") // Ensure this message length is appropriate
                .build();


        System.out.println(pantof1);


        // Uncomment and adjust the following code if needed
        // PantofBuilder pantofBuilder2 = new PantofBuilder(ETipPantof.STILETTO, 38, 11.25f, ETipMaterial.PIELE_ECOLOGICA);
        // Pantof pantof2 = pantofBuilder2.setMaterialSuplimentar(ETipMaterial.PIELE_NATURALA)
        //                                .setMesajeTextSuplimentar("bijuterii") // Ensure this message length is appropriate
        //                                .build();
        // System.out.println(pantof2);
    }
}