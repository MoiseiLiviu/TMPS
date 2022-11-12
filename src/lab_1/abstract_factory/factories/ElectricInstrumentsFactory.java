package lab_1.abstract_factory.factories;

import lab_1.abstract_factory.InstrumentsFactory;
import lab_1.abstract_factory.guitar.ElectricGuitar;
import lab_1.abstract_factory.guitar.Guitar;
import lab_1.abstract_factory.piano.ElectricPiano;
import lab_1.abstract_factory.piano.Piano;

public class ElectricInstrumentsFactory extends InstrumentsFactory {

    private static ElectricInstrumentsFactory instance;

    public static synchronized ElectricInstrumentsFactory getInstance(){
        if(instance == null){
            instance = new ElectricInstrumentsFactory();
        }
        return instance;
    }

    private ElectricInstrumentsFactory(){}

    @Override
    public Piano getPiano() {
        return new ElectricPiano();
    }

    @Override
    public Guitar getGuitar() {
        return new ElectricGuitar();
    }
}
