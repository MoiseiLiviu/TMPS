package lab_2.domain.models.guitarist;

import lab_2.domain.models.guitar.Guitar;

public class NeoSoulGuitarist extends Guitarist {

    public NeoSoulGuitarist(Guitar guitar) {
        super(guitar);
    }

    @Override
    public void perform() {
        System.out.println("Plays Blackbird by the Beatles");
        this.guitar.play();
    }
}
