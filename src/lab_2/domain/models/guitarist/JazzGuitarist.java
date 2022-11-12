package lab_2.domain.models.guitarist;

import lab_2.domain.models.guitar.Guitar;

public class JazzGuitarist extends Guitarist {

    public JazzGuitarist(Guitar guitar) {
        super(guitar);
    }

    @Override
    public void perform() {
        System.out.println("Plays Jimmy Hendrix riffs");
        this.guitar.play();
    }
}
