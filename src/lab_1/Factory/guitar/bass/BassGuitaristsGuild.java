package lab_1.Factory.guitar.bass;


import lab_1.Factory.Guitarist;
import lab_1.Factory.GuitaristsGuild;

public class BassGuitaristsGuild extends GuitaristsGuild {

    @Override
    protected Guitarist getGuitarist() {
        return new BassGuitarist();
    }
}
