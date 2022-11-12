package lab_2.domain.models.guitarist;

import lab_2.domain.models.guitar.Guitar;

public class RockGuitarist extends Guitarist {

    public RockGuitarist(Guitar guitar) {
        super(guitar);
    }

    @Override
    public void perform() {
        System.out.println("Plays Chimera by Polyphia");
        this.guitar.play();
    }
}
