package classes;


import enumerations.EFormatCarte;

import java.util.List;

public abstract class ACarteElectronica {
    protected String titlu;
    protected String autor;
    protected int numarPagini;
    protected EFormatCarte format;
    protected int nivelProtectieDRM;
    protected boolean adnotariPermise;
    protected List<String> bookmarkuri;
    protected String fontText;

    public abstract float calcularePret();
    public abstract void adaugaBookmark(String bookmark);
    public abstract void schimbaFormat(EFormatCarte format);
}