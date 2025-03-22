public class Main {
    public static void main(String[] args) {
        BuilderMagazin builder = new BuilderMagazin("Zara", 150, 2);
        Magazin m1 = builder.build();
        System.out.println(m1);
    }
}
