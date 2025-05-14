package cts.comarlau.vladConstantin.gr1115.Strategy;

import java.util.ArrayList;

public interface IStrategie {
    ProgramSpalare alege(ArrayList<ProgramSpalare> variante);
    String getName();
}
