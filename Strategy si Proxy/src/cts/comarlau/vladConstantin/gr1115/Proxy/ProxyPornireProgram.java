package cts.comarlau.vladConstantin.gr1115.Proxy;

import cts.comarlau.vladConstantin.gr1115.Interfete.Electrocasnic;

public class ProxyPornireProgram implements Electrocasnic {
    private Electrocasnic masinaDeSpalat;
    private boolean areAlimentareApa;

    public ProxyPornireProgram(Electrocasnic masinaDeSpalat, boolean areAlimentareApa) {
        this.masinaDeSpalat = masinaDeSpalat;
        this.areAlimentareApa = areAlimentareApa;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public void pornesteProgram() {
        if(this.areAlimentareApa) {
            System.out.println("Exista alimentare cu apa. Se porneste programul..");
            this.masinaDeSpalat.pornesteProgram();
        } else {
            System.out.println("Programul nu poate porni deoarece nu exista alimentare cu apa.");
        }
    }

    @Override
    public void seteazaProgram() {

    }

    @Override
    public void finalizareProgram() {

    }
}
