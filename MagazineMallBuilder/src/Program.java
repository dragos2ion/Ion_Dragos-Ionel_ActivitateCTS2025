public class Program {
    public static void main(String[] args) {
        BuilderMagazin builder = new BuilderMagazin(150, 2, "Zara");


        Magazin m1 = builder.build();
        System.out.println(m1);

    }
}
