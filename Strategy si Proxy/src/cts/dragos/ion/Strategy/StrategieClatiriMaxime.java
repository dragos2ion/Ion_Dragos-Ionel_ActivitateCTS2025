package cts.dragos.ion.Strategy;

import java.util.ArrayList;

public class StrategieClatiriMaxime implements IStrategie{
    private String name = "Program numar maxim de clatiri";

    public String getName() {
        return name;
    }

    @Override
    public ProgramSpalare alege(ArrayList<ProgramSpalare> programe) {
        ProgramSpalare program = programe.get(0);
        for (ProgramSpalare p : programe) {
            if(p.getClatiri() > program.getClatiri()) {
                program = p;
            }
        }
        return program;
    }
}
