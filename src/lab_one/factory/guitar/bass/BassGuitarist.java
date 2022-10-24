package lab_one.factory.guitar.bass;

import lab_one.factory.Guitarist;

public class BassGuitarist implements Guitarist {
    @Override
    public void playPentatonic() {
        System.out.println("Bassy bing bong bing");
    }
}
