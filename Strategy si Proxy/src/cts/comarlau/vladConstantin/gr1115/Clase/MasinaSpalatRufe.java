package cts.comarlau.vladConstantin.gr1115.Clase;

import cts.comarlau.vladConstantin.gr1115.Interfete.Electrocasnic;
import cts.comarlau.vladConstantin.gr1115.Strategy.*;

public class MasinaSpalatRufe implements Electrocasnic {
    private ProgramSpalare program;
    private IStrategie strategie;

    public void pornesteMasina(IStrategie strategie) {
        this.strategie = strategie;
        seteazaProgram();
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public void pornesteProgram() {
        afiseazaPornire();
    }

    @Override
    public void seteazaProgram() {
        Selector selector = new Selector();
        selector.add(new ProgramSpalare(10,3000));
        selector.add(new ProgramSpalare(20,4000));
        selector.add(new ProgramSpalare(30,5000));

        if(this.strategie == null) {
            this.strategie = new StrategieVitezaMaxima();
        }

        selector.setStrategie(this.strategie);

        this.program = selector.alege();
        afiseazaProgram();
    }

    @Override
    public void finalizareProgram() {

    }

    public void afiseazaProgram() {
        System.out.println("A fost selectat programul: " + this.strategie.getName());
    }

    public void afiseazaPornire() {
        System.out.println("A pornit programul: " + this.strategie.getName());
    }
}
