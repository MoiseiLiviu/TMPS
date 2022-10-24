package lab_1.AbstractFactory.guitar;

public class AcousticGuitar implements Guitar{
    @Override
    public void playChord() {
        System.out.println("Playing C major on acoustic guitar.");
    }
}
