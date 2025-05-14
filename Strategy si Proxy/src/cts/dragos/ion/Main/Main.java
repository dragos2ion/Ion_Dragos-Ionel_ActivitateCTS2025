package cts.dragos.ion.Main;//sub nr 1
//de ce aceste pattern?
// cts.comarlau.vladConstantin.gr1115.Strategy deoarece trebuie facuta o decizie cu privire la alegera unei implementari (strategii) de program din mai multe existente
// cts.comarlau.vladConstantin.gr1115.Proxy deoarece sunt necesare implementari care sa restricitoneze modul de functionare al masinii de spalat

import cts.dragos.ion.Clase.MasinaSpalatRufe;
import cts.dragos.ion.Interfete.Electrocasnic;
import cts.dragos.ion.Proxy.ProxyPornireProgram;
import cts.dragos.ion.Strategy.StrategieClatiriMaxime;
import cts.dragos.ion.Strategy.StrategieVitezaMaxima;

public class Main {
    public static void main(String[] args) {
        MasinaSpalatRufe masina1 = new MasinaSpalatRufe();
        masina1.pornesteMasina(new StrategieClatiriMaxime());

        MasinaSpalatRufe masina2 = new MasinaSpalatRufe();
        masina2.pornesteMasina(new StrategieVitezaMaxima());

        Electrocasnic masina3 = new MasinaSpalatRufe();
        masina3.seteazaProgram();

        ProxyPornireProgram proxy1 = new ProxyPornireProgram(masina3, false);
        ProxyPornireProgram proxy2 = new ProxyPornireProgram(masina3, true);

        proxy1.pornesteProgram();
        proxy2.pornesteProgram();
    }
}