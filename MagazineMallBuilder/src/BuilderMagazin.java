import java.util.ArrayList;
import java.util.List;

public class BuilderMagazin implements IBuilder{
    private IPodea podea;
    private List<IDecoratiuni> listaDecoratiuni = null;
    private float suprafata;
    private int nrIntrari;
    private String denumire;

    public BuilderMagazin(float suprafata, int nrIntrari, String denumire) {
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.denumire = denumire;
        this.listaDecoratiuni = new ArrayList<>();
    }

    public BuilderMagazin addDecoratiune(IDecoratiuni d){
        if(d!=null){
            this.listaDecoratiuni.add(d);
        }
        return this;
    }

    public BuilderMagazin setPodea(IPodea podea) {
        this.podea = podea;
        return this;
    }

    @Override
    public Magazin build() {
        Magazin m = null;

        if (suprafata / 100 > this.nrIntrari) {
            return null;
        }

        if(this.podea == null){
            this.podea = new PodeaCiment();
        }

        if(this.podea.getDuritate()< 2){
            for(IDecoratiuni d:this.listaDecoratiuni){
                if(d.getMaterial()==ETipMaterial.STICLA)
                    return null;
            }
        }

        m = new Magazin(podea, suprafata, nrIntrari, denumire);

        for(IDecoratiuni d:this.listaDecoratiuni){
            m.addDecoratiune(d);
        }

        return m;
    }

}
