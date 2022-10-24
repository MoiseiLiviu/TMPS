package lab_1.Factory.guitar.bass;

import lab_1.Factory.Guitarist;

public class BassGuitarist implements Guitarist {
    @Override
    public void playPentatonic() {
        System.out.println("Bassy bing bong bing");
    }
}
