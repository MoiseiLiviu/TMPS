package lab_1.AbstractFactory.factories;

import lab_1.AbstractFactory.InstrumentsFactory;
import lab_1.AbstractFactory.guitar.ElectricGuitar;
import lab_1.AbstractFactory.guitar.Guitar;
import lab_1.AbstractFactory.piano.ElectricPiano;
import lab_1.AbstractFactory.piano.Piano;

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
