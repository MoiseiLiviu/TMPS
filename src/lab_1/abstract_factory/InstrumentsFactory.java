package lab_1.abstract_factory;

import lab_1.abstract_factory.guitar.Guitar;
import lab_1.abstract_factory.piano.Piano;

public abstract class InstrumentsFactory {

    public abstract Piano getPiano();

    public abstract Guitar getGuitar();
}
