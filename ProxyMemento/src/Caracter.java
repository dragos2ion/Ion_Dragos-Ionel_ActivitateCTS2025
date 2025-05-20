
public class Caracter implements ICaracter {
    private final TipCaracter tip;
    private String culoarePar;
    private String arme;
    private String culoarePiele;

    public Caracter(TipCaracter tip, String culoarePar, String arme, String culoarePiele) {
        this.tip = tip;
        this.culoarePar = culoarePar;
        this.arme = arme;
        this.culoarePiele = culoarePiele;
    }

    @Override
    public String getDescriereCaracter() {
        return "Caracter: " + tip + ", Par: " + culoarePar + ", Arme: " + arme + ", Piele: " + culoarePiele;
    }

    public MementoCaracter salvare() {
        return new MementoCaracter(culoarePar, arme, culoarePiele);
    }

    public void revenire(MementoCaracter memento) {
        this.culoarePar = memento.getCuloarePar();
        this.arme = memento.getArme();
        this.culoarePiele = memento.getCuloarePiele();
    }
}
