public class Spital implements ISpital {
    @Override
    public void intrareSalon(String numeVizitator, int idPacient, int zi) {
        System.out.println("Vizitatorul " + numeVizitator + " a intrat la pacientul " + idPacient + " în ziua " + zi + ".");
    }
}