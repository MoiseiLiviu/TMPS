package lab_one.abstract_factory.factories;

import lab_one.abstract_factory.InstrumentsFactory;
import lab_one.abstract_factory.guitar.AcousticGuitar;
import lab_one.abstract_factory.guitar.Guitar;
import lab_one.abstract_factory.piano.AcousticPiano;
import lab_one.abstract_factory.piano.Piano;

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
