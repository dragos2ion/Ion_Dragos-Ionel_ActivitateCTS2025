import java.util.ArrayList;
import java.util.List;

public class BuilderMagazin implements Builder{

    private String denumire;
    private double suprafata;
    private int numarIntrari;
    private PodeaCiment podea;
    private List<Decoratiune> decoratiuni;

     BuilderMagazin(String denumire, double suprafata, int numarIntrari) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.numarIntrari = numarIntrari;
        this.decoratiuni = new ArrayList<>();
    }


    public BuilderMagazin setPodea(PodeaCiment podea) {
        this.podea = podea;
        return this;
    }

    public BuilderMagazin setDecoratiuni(Decoratiune decoratiuni) {
        this.decoratiuni.add(decoratiuni);
        return this;
    }

    @Override
    public Magazin build() {
        Magazin m = null;

        m = new Magazin(denumire, suprafata, numarIntrari, podea);
        for(Decoratiune d:this.decoratiuni){
            m.addDecoratiune(d);
        }


        return m;
    }
}
