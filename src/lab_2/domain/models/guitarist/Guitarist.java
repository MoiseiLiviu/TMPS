package lab_2.domain.models.guitarist;

import lab_2.domain.models.guitar.Guitar;

public abstract class Guitarist {

    protected final Guitar guitar;

    protected Guitarist(Guitar guitar) {
        this.guitar = guitar;
    }

    public abstract void perform();
}
