package lab_2;

import lab_2.domain.models.ElectricGuitarWithDistortionProxy;
import lab_2.domain.models.guitar.ElectricGuitar;
import lab_2.domain.models.guitarist.Guitarist;
import lab_2.domain.models.guitarist.JazzGuitarist;
import lab_2.domain.models.guitarist.RockGuitarist;
import lab_2.domain.models.guitarist.WarmupGuitaristDecorator;

public class Main {

    public static void main(String[] args) {

        Guitarist jazzGuitarist = new JazzGuitarist(new ElectricGuitar());
        jazzGuitarist.perform();

        Guitarist rockGuitarist = new RockGuitarist(new ElectricGuitarWithDistortionProxy());
        rockGuitarist.perform();

        Guitarist warmupRockGuitarist = new WarmupGuitaristDecorator(rockGuitarist);
        warmupRockGuitarist.perform();
    }
}
