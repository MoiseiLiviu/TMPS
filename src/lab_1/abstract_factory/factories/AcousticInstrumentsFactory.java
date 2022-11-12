package lab_1.abstract_factory.factories;

import lab_1.abstract_factory.InstrumentsFactory;
import lab_1.abstract_factory.guitar.AcousticGuitar;
import lab_1.abstract_factory.guitar.Guitar;
import lab_1.abstract_factory.piano.AcousticPiano;
import lab_1.abstract_factory.piano.Piano;

public class AcousticInstrumentsFactory extends InstrumentsFactory {

    private static AcousticInstrumentsFactory instance;

    public static synchronized AcousticInstrumentsFactory getInstance(){
        if(instance == null){
            instance = new AcousticInstrumentsFactory();
        }
        return instance;
    }

    private AcousticInstrumentsFactory(){}

    @Override
    public Piano getPiano() {
        return new AcousticPiano();
    }

    @Override
    public Guitar getGuitar() {
        return new AcousticGuitar();
    }
}
