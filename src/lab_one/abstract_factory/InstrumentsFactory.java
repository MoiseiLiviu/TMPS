package lab_one.abstract_factory;

import lab_one.abstract_factory.guitar.Guitar;
import lab_one.abstract_factory.piano.Piano;

public abstract class InstrumentsFactory {

    public abstract Piano getPiano();

    public abstract Guitar getGuitar();
}
