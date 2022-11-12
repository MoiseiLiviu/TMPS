package lab_1.factory.guitar.bass;


import lab_1.factory.Guitarist;
import lab_1.factory.GuitaristsGuild;

public class BassGuitaristsGuild extends GuitaristsGuild {

    @Override
    protected Guitarist getGuitarist() {
        return new BassGuitarist();
    }
}
