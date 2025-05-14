package cts.dragos.ion.Strategy;

import java.util.ArrayList;

public class Selector {
    private ArrayList<ProgramSpalare> variante = new ArrayList<>();
    private IStrategie strategie;

    public void setStrategie(IStrategie strategie) {
        this.strategie = strategie;
    }

    public void add(ProgramSpalare v) {
        this.variante.add(v);
    }

    public ProgramSpalare alege() {
       return(this.strategie.alege(variante));
    }
}
