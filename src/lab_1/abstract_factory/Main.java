package lab_1.abstract_factory;

import lab_1.InstrumentType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        InstrumentType instrumentType = InstrumentType.valueOf(type);
        Gig gig = new Gig(instrumentType);
        gig.playGuitar();
        gig.playPiano();
    }
}
