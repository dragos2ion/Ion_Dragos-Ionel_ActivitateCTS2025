
public class Program {

	public static void main(String[] args) {
		Receptionist receptionist = Receptionist.getInstance();
		System.err.println(Facade.verificaMasa(1));
		receptionist.ocupaMasa(1);
		System.err.println(Facade.verificaMasa(1));
		receptionist.elibereazaMasa(1);
		System.err.println(Facade.verificaMasa(1));
		receptionist.debaraseazaMasa(1);
		System.err.println(Facade.verificaMasa(1));
		receptionist.puneServeteleNoiPeMasa(1);
		System.err.println(Facade.verificaMasa(1));
	}

}
