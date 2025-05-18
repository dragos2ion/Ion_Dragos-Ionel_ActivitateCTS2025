package cts.cristea.razvan.g1115.proxy;

import cts.cristea.razvan.g1115.classes.Camera;
import cts.cristea.razvan.g1115.interfaces.CameraCCTV;

public class ProxyCamera implements CameraCCTV {

    private CameraCCTV cameraSupraveghere;

    public ProxyCamera(CameraCCTV cameraSupraveghere) {
        this.cameraSupraveghere = cameraSupraveghere;
    }

    @Override
    public void transmiteImagini() {
        if (((Camera) cameraSupraveghere).isEsteSenzorulActiv()) {
            cameraSupraveghere.transmiteImagini();
        } else {
            System.out.println("Din proxy nu este permisa transmiterea imaginilor atunci cand senzorul camerei nu este activ");
        }
    }

    @Override
    public boolean activareSenzorMiscare() {
        return cameraSupraveghere.activareSenzorMiscare();
    }
}