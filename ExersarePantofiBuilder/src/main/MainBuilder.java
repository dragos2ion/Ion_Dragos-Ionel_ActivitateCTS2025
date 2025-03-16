package main;

import classes.Pantof;
import classes.PantofBuilder;
import enumerations.ETipMaterial;
import enumerations.ETipPantof;

public class MainBuilder{
    public static void main(String[] args) throws Exception {
        PantofBuilder pantofBuilder = new PantofBuilder(ETipPantof.GHETE, 35, 2.0f, ETipMaterial.SINTETIC);
        Pantof pantof = pantofBuilder.build();
        System.out.println(pantof);
    };
}