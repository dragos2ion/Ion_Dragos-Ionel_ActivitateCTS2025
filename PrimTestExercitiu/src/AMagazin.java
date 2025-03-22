import java.util.List;

public abstract class AMagazin {
    protected String denumire;
    protected double suprafata;
    protected int numarIntrari;
    protected PodeaCiment podea;
    protected List<Decoratiune> decoratiuni = null;


    public abstract double calculGradIncendiu();
    public abstract void addDecoratiune(Decoratiune decoratiune);
    public abstract void setPodea(PodeaCiment podea);
}