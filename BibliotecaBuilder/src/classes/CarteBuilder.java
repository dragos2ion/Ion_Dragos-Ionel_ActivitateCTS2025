package classes;

import interfaces.Builder;

public class CarteBuilder implements Builder {
    private CarteElectronica carte;

    public CarteBuilder(CarteElectronica carte) {
        this.carte = carte;
    }

    @Override
    public CarteElectronica build() throws Exception {
        return null;
    }
}
