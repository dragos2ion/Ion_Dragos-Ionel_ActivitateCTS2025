public class Decoratiune implements IDecoratiuni{
    private ETipMaterial tipMaterial;
    private String denumire;

    public Decoratiune(String denumire, ETipMaterial tipMaterial) {
        this.denumire = denumire;
        this.tipMaterial = tipMaterial;
    }

    @Override
    public ETipMaterial getMaterial() {
        return this.tipMaterial;
    }


    @Override
    public String toString() {
        return "Decoratiune{" +
                "tipMaterial=" + tipMaterial +
                ", denumire='" + denumire + '\'' +
                '}';
    }
}
