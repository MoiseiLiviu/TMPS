package lab_1.Factory.guitar.classic;

import lab_1.Factory.Guitarist;
import lab_1.Factory.GuitaristsGuild;

public class ClassicGuitaristsGuild extends GuitaristsGuild {

    @Override
    protected Guitarist getGuitarist() {
        return new ClassicGuitarist();
    }
}
