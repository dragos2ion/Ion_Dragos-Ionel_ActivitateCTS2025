public class Program {
    public static void main(String[] args) {
        Preparat p1 = new Preparat("paine", 45, 100);
        Preparat p2 = new Preparat("pizza", 30, 250);

        Cuptor.getInstance().addPreparat(p1);
        Cuptor.getInstance().addPreparat(p2);

        System.out.println(Cuptor.getInstance());
    }
}
