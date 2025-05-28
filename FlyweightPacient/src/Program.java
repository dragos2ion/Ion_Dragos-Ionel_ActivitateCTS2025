public class Program {

	public static void main(String[] args) {
		PacientFlyweightFactory factory = new PacientFlyweightFactory();

		Pacient pacient1 = new Pacient("Dulgheru Mihai-Nicolae", "0751234567", "Str. Codrii Cosminului 13");
		Pacient pacient2 = new Pacient("Popescu Andrei", "0751234568", "Str. Codrii Cosminului 14");
		Pacient pacient3 = new Pacient("Popescu Ion", "0751234569", "Str. Codrii Cosminului 15");

		Salon salon1 = new Salon(1, 1, 1);
		Salon salon2 = new Salon(2, 2, 2);
		Salon salon3 = new Salon(3, 3, 3);

		Internare internare1 = new Internare(salon1);
		internare1.interneazaPacient(factory.getPacient(pacient1));
		Internare internare2 = new Internare(salon2);
		internare2.interneazaPacient(factory.getPacient(pacient2));
		Internare internare3 = new Internare(salon3);
		internare3.interneazaPacient(factory.getPacient(pacient3));
		Internare internare4 = new Internare(salon1);
		internare4.interneazaPacient(factory.getPacient(pacient1));

		System.out.println(factory.getColectiePacienti().size());
		System.out.println(factory.getColectiePacienti());
	}

}
