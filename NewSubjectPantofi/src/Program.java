public class Program {
    public static void main(String[] args) {
        PantofBuilder builder = new PantofBuilder(ETipPantof.GHETE, 40, 2f, ETipMaterial.PIELE);
        Pantof p1 = builder.build();

        System.out.println(p1);
    }
}
