
public class CaracterBuilder {
    private final TipCaracter tip;
    private String culoarePar = "negru";
    private String arme = "fara";
    private String culoarePiele = "deschisa";

    public CaracterBuilder(TipCaracter tip) {
        this.tip = tip;
    }

    public CaracterBuilder setCuloarePar(String culoarePar) {
        this.culoarePar = culoarePar;
        return this;
    }

    public CaracterBuilder setArme(String arme) {
        this.arme = arme;
        return this;
    }

    public CaracterBuilder setCuloarePiele(String culoarePiele) {
        this.culoarePiele = culoarePiele;
        return this;
    }

    public Caracter build() {
        return new Caracter(tip, culoarePar, arme, culoarePiele);
    }
}
