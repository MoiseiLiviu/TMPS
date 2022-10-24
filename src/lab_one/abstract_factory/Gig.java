package lab_one.abstract_factory;

import lab_one.abstract_factory.factories.AcousticInstrumentsFactory;
import lab_one.abstract_factory.factories.ElectricInstrumentsFactory;
import lab_one.abstract_factory.guitar.Guitar;
import lab_one.abstract_factory.piano.Piano;
import lab_one.InstrumentType;

public class Gig {

    private final Piano piano;
    private final Guitar guitar;

    public Gig(InstrumentType type) {
        InstrumentsFactory instrumentsFactory = switch (type) {
            case ELECTRIC:
                yield new ElectricInstrumentsFactory();
            case ACOUSTIC:
                yield new AcousticInstrumentsFactory();
            default: throw new RuntimeException("Type not valid.");
        };
        this.piano = instrumentsFactory.getPiano();
        this.guitar = instrumentsFactory.getGuitar();
    }

    public void smashThatPiano(){
        this.piano.playScale();
    }

    public void destroyThatGuitar(){
        this.guitar.playChord();
    }
}
