package lab_1.factory.guitar.bass;

import lab_1.factory.Guitarist;

public class BassGuitarist implements Guitarist {
    @Override
    public void playPentatonic() {
        System.out.println("Bassy bing bong bing");
    }
}
