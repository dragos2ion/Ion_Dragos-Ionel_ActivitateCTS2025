package cts.comarlau.vladConstantin.gr1115.Strategy;

import java.util.ArrayList;

public class StrategieClatiriVitezaMinim implements IStrategie{
    private String name = "Program viteza maxima si numar maxim de clatiri";

    public String getName() {
        return name;
    }

    @Override
    public ProgramSpalare alege(ArrayList<ProgramSpalare> programe) {
        ProgramSpalare program = programe.get(0);
        for (ProgramSpalare p : programe) {
            if(p.getViteza() < program.getViteza()
                && p.getClatiri() < program.getClatiri()) {
                program = p;
            }
        }
        return program;
    }
}
