public class PodeaLemn implements IPodea{
private float duritate;

    public PodeaLemn(float duritate) {
        this.duritate = duritate;
    }



    @Override
    public float getDuritate() {
        return this.duritate;
    }


    @Override
    public String toString() {
        return "PodeaLemn{" +
                "duritate=" + duritate +
                '}';
    }
}
