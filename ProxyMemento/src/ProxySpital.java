
import java.util.HashMap;
import java.util.Map;

public class ProxySpital implements ISpital {
    private ISpital spital;
    private Map<String, Integer> viziteZilnice = new HashMap<>();

    private int ziCurenta = 1;

    public ProxySpital(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void intrareSalon(String numeVizitator, int idPacient, int zi) {
        String cheie = numeVizitator + "-" + idPacient + "-" + zi;
        if (!viziteZilnice.containsKey(cheie)) {
            spital.intrareSalon(numeVizitator, idPacient, zi);
            viziteZilnice.put(cheie, 1);
        } else {
            System.out.println("ACCES RESTRICȚIONAT: " + numeVizitator + " a vizitat deja pacientul " + idPacient + " în ziua " + zi + ".");
        }
    }

    public void resetareZi() {
        ziCurenta++;
        viziteZilnice.clear();
        System.out.println("Resetare vizite pentru ziua " + ziCurenta);
    }

    public int getZiCurenta() {
        return ziCurenta;
    }
}
