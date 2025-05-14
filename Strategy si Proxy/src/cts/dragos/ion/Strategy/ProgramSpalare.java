package cts.dragos.ion.Strategy;

public class ProgramSpalare {
    int clatiri;
    int viteza;

    public ProgramSpalare(int clatiri, int viteza) {
        this.clatiri = clatiri;
        this.viteza = viteza;
    }

    public int getClatiri() {
        return clatiri;
    }

    public int getViteza() {
        return viteza;
    }

    @Override
    public String toString() {
        return "ProgramSpalare{" +
                "clatiri=" + clatiri +
                ", viteza=" + viteza +
                '}';
    }
}
