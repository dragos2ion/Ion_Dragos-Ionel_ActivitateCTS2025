

public class Main {
    public static void main(String[] args) {
        // Testare Proxy Pattern - Spital
        ISpital spital = new ProxySpital(new Spital());

        spital.intrareSalon("Andrei", 1, 1);
        spital.intrareSalon("Andrei", 1, 1); // restricționat
        spital.intrareSalon("Maria", 1, 1);
        ((ProxySpital) spital).resetareZi();
        spital.intrareSalon("Andrei", 1, ((ProxySpital) spital).getZiCurenta());

        // Testare Memento + Builder - Joc
        CaracterBuilder builder = new CaracterBuilder(TipCaracter.ELF)
                .setCuloarePar("rosu")
                .setArme("sabie")
                .setCuloarePiele("bronzata");
        Caracter caracter = builder.build();

        System.out.println(caracter.getDescriereCaracter());

        MementoCaracter backup = caracter.salvare();
        caracter.revenire(new MementoCaracter("verde", "arc", "deschisa"));

        System.out.println("Dupa modificare: " + caracter.getDescriereCaracter());

        caracter.revenire(backup);
        System.out.println("Dupa revenire: " + caracter.getDescriereCaracter());
    }
}
