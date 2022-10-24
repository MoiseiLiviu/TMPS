package lab_one.abstract_factory;

import lab_one.InstrumentType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        InstrumentType instrumentType = InstrumentType.valueOf(type);
        Gig gig = new Gig(instrumentType);
        gig.destroyThatGuitar();
        gig.smashThatPiano();
    }
}
