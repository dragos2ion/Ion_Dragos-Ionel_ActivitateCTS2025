package cts.dragos.ion.Strategy;

import java.util.ArrayList;

public interface IStrategie {
    ProgramSpalare alege(ArrayList<ProgramSpalare> variante);
    String getName();
}
