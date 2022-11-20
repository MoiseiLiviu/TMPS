package lab_2.domain.models.guitar;

import java.util.concurrent.atomic.AtomicLong;

public abstract class Guitar {

    private Long id;

    private GuitarSpecification guitarSpecification;

    private static final AtomicLong idSequence = new AtomicLong();

    protected Guitar(){
        this.id = idSequence.incrementAndGet();
    }

    public abstract void play();

    public void setGuitarSpecification(GuitarSpecification guitarSpecification) {
        this.guitarSpecification = guitarSpecification;
    }

    public GuitarSpecification getGuitarSpecification() {
        return guitarSpecification;
    }
}
