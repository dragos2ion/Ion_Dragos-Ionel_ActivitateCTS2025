
public class MementoCaracter {
    private final String culoarePar;
    private final String arme;
    private final String culoarePiele;

    public MementoCaracter(String culoarePar, String arme, String culoarePiele) {
        this.culoarePar = culoarePar;
        this.arme = arme;
        this.culoarePiele = culoarePiele;
    }

    public String getCuloarePar() {
        return culoarePar;
    }

    public String getArme() {
        return arme;
    }

    public String getCuloarePiele() {
        return culoarePiele;
    }
}
