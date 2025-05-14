package cts.cristea.razvan.g1115.main;

import cts.cristea.razvan.g1115.classes.Administrator;
import cts.cristea.razvan.g1115.classes.Camera;
import cts.cristea.razvan.g1115.interfaces.CameraCCTV;
import cts.cristea.razvan.g1115.observer.Observator;

public class ProgramObservator {
    public static void main(String[] args) {
        Observator observator1 = new Administrator("Ioan");
        Observator observator2 = new Administrator("Maria");
        Observator observator3 = new Administrator("Andreea");

        CameraCCTV cameraSupravegehere = new Camera();

        cameraSupravegehere.transmiteImagini();

        ((Camera) cameraSupravegehere).adaugaObservator(observator1);
        ((Camera) cameraSupravegehere).adaugaObservator(observator2);

        cameraSupravegehere.transmiteImagini();

        cameraSupravegehere.activareSenzorMiscare();

        cameraSupravegehere.transmiteImagini();

        ((Camera) cameraSupravegehere).adaugaObservator(observator3);

        cameraSupravegehere.transmiteImagini();

        ((Camera) cameraSupravegehere).stergeObservator(observator2);

        cameraSupravegehere.transmiteImagini();

        // s-a ales pattern ul Observer pentru ca trebuiau notificati toti angajatii atunci cand
        // senzorul camerei de luat vederi este activ, si trebuiau notificati toti angajatii
    }
}