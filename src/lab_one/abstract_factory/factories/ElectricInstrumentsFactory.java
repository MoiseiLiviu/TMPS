package lab_one.abstract_factory.factories;

import lab_one.abstract_factory.InstrumentsFactory;
import lab_one.abstract_factory.guitar.ElectricGuitar;
import lab_one.abstract_factory.guitar.Guitar;
import lab_one.abstract_factory.piano.ElectricPiano;
import lab_one.abstract_factory.piano.Piano;

public class ElectricInstrumentsFactory extends InstrumentsFactory {

    @Override
    public Piano getPiano() {
        return new ElectricPiano();
    }

    @Override
    public Guitar getGuitar() {
        return new ElectricGuitar();
    }
}
