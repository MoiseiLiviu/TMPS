package lab_1.AbstractFactory.factories;

import lab_1.AbstractFactory.InstrumentsFactory;
import lab_1.AbstractFactory.guitar.AcousticGuitar;
import lab_1.AbstractFactory.guitar.Guitar;
import lab_1.AbstractFactory.piano.AcousticPiano;
import lab_1.AbstractFactory.piano.Piano;

public class AcousticInstrumentsFactory extends InstrumentsFactory {

    @Override
    public Piano getPiano() {
        return new AcousticPiano();
    }

    @Override
    public Guitar getGuitar() {
        return new AcousticGuitar();
    }
}
