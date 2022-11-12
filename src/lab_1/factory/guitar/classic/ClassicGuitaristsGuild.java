package lab_1.factory.guitar.classic;

import lab_1.factory.Guitarist;
import lab_1.factory.GuitaristsGuild;

public class ClassicGuitaristsGuild extends GuitaristsGuild {

    @Override
    protected Guitarist getGuitarist() {
        return new ClassicGuitarist();
    }
}
