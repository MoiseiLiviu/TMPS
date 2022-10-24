package lab_one.factory.guitar.classic;

import lab_one.factory.Guitarist;
import lab_one.factory.GuitaristsGuild;

public class ClassicGuitaristsGuild extends GuitaristsGuild {

    @Override
    protected Guitarist getGuitarist() {
        return new ClassicGuitarist();
    }
}
