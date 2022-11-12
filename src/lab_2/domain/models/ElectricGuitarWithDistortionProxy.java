package lab_2.domain.models;

import lab_2.domain.models.guitar.ElectricGuitar;
import lab_2.domain.models.guitar.Guitar;

public class ElectricGuitarWithDistortionProxy implements Guitar {

    private final Guitar electricGuitar = new ElectricGuitar();

    @Override
    public void play() {
        System.out.println("Applying distortion");
        this.electricGuitar.play();
    }
}
