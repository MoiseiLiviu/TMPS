package lab_one.abstract_factory.guitar;

public class ElectricGuitar implements Guitar{
    @Override
    public void playChord() {
        System.out.println("Playing C major on electric guitar.");
    }
}
