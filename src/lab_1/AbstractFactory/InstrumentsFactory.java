package lab_1.AbstractFactory;

import lab_1.AbstractFactory.guitar.Guitar;
import lab_1.AbstractFactory.piano.Piano;

public abstract class InstrumentsFactory {

    public abstract Piano getPiano();

    public abstract Guitar getGuitar();
}
