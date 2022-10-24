package lab_1.AbstractFactory;

import lab_1.AbstractFactory.factories.AcousticInstrumentsFactory;
import lab_1.AbstractFactory.factories.ElectricInstrumentsFactory;
import lab_1.AbstractFactory.guitar.Guitar;
import lab_1.AbstractFactory.piano.Piano;
import lab_1.InstrumentType;

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
