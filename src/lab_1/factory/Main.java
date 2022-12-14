package lab_1.factory;

import lab_1.factory.guitar.bass.BassGuitaristsGuild;
import lab_1.factory.guitar.classic.ClassicGuitaristsGuild;
import lab_1.InstrumentType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        InstrumentType instrumentType = InstrumentType.valueOf(type);
        GuitaristsGuild guitaristsGuild = switch (instrumentType) {
            case BASS:
                yield new BassGuitaristsGuild();
            case CLASSIC:
                yield new ClassicGuitaristsGuild();
            default: throw new RuntimeException("Type not supported.");
        };
        guitaristsGuild.shred();
    }
}
