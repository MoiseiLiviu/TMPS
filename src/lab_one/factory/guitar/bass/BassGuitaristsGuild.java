package lab_one.factory.guitar.bass;


import lab_one.factory.Guitarist;
import lab_one.factory.GuitaristsGuild;

public class BassGuitaristsGuild extends GuitaristsGuild {

    @Override
    protected Guitarist getGuitarist() {
        return new BassGuitarist();
    }
}
