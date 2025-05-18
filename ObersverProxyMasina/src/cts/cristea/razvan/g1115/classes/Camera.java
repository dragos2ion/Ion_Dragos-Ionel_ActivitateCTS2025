package cts.cristea.razvan.g1115.classes;

import cts.cristea.razvan.g1115.interfaces.CameraCCTV;
import cts.cristea.razvan.g1115.observer.Observator;

import java.util.ArrayList;
import java.util.List;

public class Camera implements CameraCCTV {
    private List<Observator> observatori;
    private boolean esteSenzorulActiv;

    public Camera() {
        this.observatori = new ArrayList<>();
        esteSenzorulActiv = false;
    }

    public void adaugaObservator(Observator observator) {
        observatori.add(observator);
    }

    public void stergeObservator(Observator observator) {
        observatori.remove(observator);
    }

    public boolean isEsteSenzorulActiv() {
        return esteSenzorulActiv;
    }

    @Override
    public void transmiteImagini() {
        if (observatori.isEmpty()) {
            System.out.println("Nu exista observatori nu se pot trimite notificari");
            return;
        }

        if (!esteSenzorulActiv) {
            System.out.println("Senzorul de miscare este inactiv, nu se pot trimite notificari");
            return;
        }

        for (Observator observator : observatori) {
            observator.primesteNotificare();
        }
    }

    @Override
    public boolean activareSenzorMiscare() {
        esteSenzorulActiv = true;
        return esteSenzorulActiv;
    }
}