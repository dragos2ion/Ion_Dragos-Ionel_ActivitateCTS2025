import java.util.ArrayList;
import java.util.List;

public class Magazin extends AMagazin{

     Magazin(String denumire, double suprafata, int numarIntrari, PodeaCiment podea) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.numarIntrari = numarIntrari;
        this.podea = podea;
        this.decoratiuni = new ArrayList<>();
    }

    @Override
    public double calculGradIncendiu() {
        return 0;
    }

    @Override
    public void addDecoratiune(Decoratiune d) {
        this.decoratiuni.add(d);
    }

    @Override
    public void setPodea(PodeaCiment podea) {
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", suprafata=" + suprafata +
                ", numarIntrari=" + numarIntrari +
                ", podea=" + podea +
                ", decoratiuni=" + decoratiuni +
                "} " + super.toString();
    }
}
