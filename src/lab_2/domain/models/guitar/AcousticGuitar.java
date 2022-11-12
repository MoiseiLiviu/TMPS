package lab_2.domain.models.guitar;

public class AcousticGuitar implements Guitar {

    @Override
    public void play() {
        System.out.println("Acoustic guitar sounds");
    }
}
