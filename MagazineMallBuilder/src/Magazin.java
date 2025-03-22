import java.util.ArrayList;

public class Magazin extends AMagazin{


     Magazin(IPodea podea, float suprafata, int nrIntrari, String denumire) {
        super(podea, suprafata, nrIntrari, denumire);
    }

    void addDecoratiune(IDecoratiuni decoratiuni) {
        if (this.listaDecoratiuni == null) {
            this.listaDecoratiuni = new ArrayList<>();
        }
        if (decoratiuni != null) {
            this.listaDecoratiuni.add(decoratiuni);
        }
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "podea=" + podea +
                ", listaDecoratiuni=" + listaDecoratiuni +
                ", suprafata=" + suprafata +
                ", nrIntrari=" + nrIntrari +
                ", denumire='" + denumire + '\'' +
                "} " + super.toString();
    }
}
