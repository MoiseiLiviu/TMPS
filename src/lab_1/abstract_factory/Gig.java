package lab_1.abstract_factory;

import lab_1.abstract_factory.factories.AcousticInstrumentsFactory;
import lab_1.abstract_factory.factories.ElectricInstrumentsFactory;
import lab_1.abstract_factory.guitar.Guitar;
import lab_1.abstract_factory.piano.Piano;
import lab_1.InstrumentType;

public class Gig {

    private final Piano piano;
    private final Guitar guitar;

    public Gig(InstrumentType type) {
        InstrumentsFactory instrumentsFactory = switch (type) {
            case ELECTRIC:
                yield ElectricInstrumentsFactory.getInstance();
            case ACOUSTIC:
                yield AcousticInstrumentsFactory.getInstance();
            default: throw new RuntimeException("Type not valid.");
        };
        this.piano = instrumentsFactory.getPiano();
        this.guitar = instrumentsFactory.getGuitar();
    }

    public void playPiano(){
        this.piano.playScale();
    }

    public void playGuitar(){
        this.guitar.playChord();
    }
}
