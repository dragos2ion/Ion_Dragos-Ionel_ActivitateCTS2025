package cts.cristea.razvan.g1115.main;

import cts.cristea.razvan.g1115.classes.Camera;
import cts.cristea.razvan.g1115.interfaces.CameraCCTV;
import cts.cristea.razvan.g1115.proxy.ProxyCamera;

import java.util.ArrayList;
import java.util.List;

public class ProgramProxy {
    public static void main(String[] args) {
        CameraCCTV camera1 = new Camera();
        CameraCCTV camera2 = new Camera();
        CameraCCTV camera3 = new Camera();

        CameraCCTV proxyCamera1 = new ProxyCamera(camera1);
        CameraCCTV proxyCamera2 = new ProxyCamera(camera2);
        CameraCCTV proxyCamera3 = new ProxyCamera(camera3);

        List<CameraCCTV> proxyCamere = new ArrayList<>();

        proxyCamera2.activareSenzorMiscare();
        proxyCamera3.activareSenzorMiscare();

        proxyCamere.add(proxyCamera1);
        proxyCamere.add(proxyCamera2);
        proxyCamere.add(proxyCamera3);

        for (int j = 0; j < proxyCamere.size(); j++) {
            System.out.print("Din camera " + (j + 1) + " -> ");
            proxyCamere.get(j).transmiteImagini();
        }

        proxyCamera1.activareSenzorMiscare();

        proxyCamera1.transmiteImagini();

        // s-a ales Proxy pattern pentru ca se dorea transmiterea imaginilor doar atunci cand senzorul era activ
    }
}