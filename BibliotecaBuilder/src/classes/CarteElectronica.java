package classes;

import enumerations.EFormatCarte;

public class CarteElectronica extends ACarteElectronica{

    

    @Override
    public float calcularePret() {
        return 0;
    }

    @Override
    public void adaugaBookmark(String bookmark) {

    }

    @Override
    public void schimbaFormat(EFormatCarte format) {

    }


    @Override
    public String toString() {
        return "CarteElectronica{" +
                "fontText='" + fontText + '\'' +
                ", bookmarkuri=" + bookmarkuri +
                ", adnotariPermise=" + adnotariPermise +
                ", nivelProtectieDRM=" + nivelProtectieDRM +
                ", format=" + format +
                ", numarPagini=" + numarPagini +
                ", autor='" + autor + '\'' +
                ", titlu='" + titlu + '\'' +
                "} " + super.toString();
    }
}
