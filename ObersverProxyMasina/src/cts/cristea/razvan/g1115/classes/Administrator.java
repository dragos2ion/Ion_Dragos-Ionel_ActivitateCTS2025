package cts.cristea.razvan.g1115.classes;

import cts.cristea.razvan.g1115.observer.Observator;

public class Administrator implements Observator {
    private String nume;

    public Administrator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare() {
        System.out.println("Administrator cu numele " + this.nume + " ai primit o imagine transmisa de camera de luat vederi");
    }
}