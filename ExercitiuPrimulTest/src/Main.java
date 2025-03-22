public class Main {
    public static void main(String[] args) {
        BuilderPantof builder = new BuilderPantof(ETipPantof.GHETE, 37, 2f, ETipMaterial.PIELE);
        Pantof p1 = builder.setMaterialeSuplimentare(ETipMaterial.TEXTIL)
                .setListaMesajeText("Mogos")
                .build();
        System.out.println(p1);
    }
}
