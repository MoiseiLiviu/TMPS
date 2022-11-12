package lab_1.abstract_factory.piano;

public class ElectricPiano implements Piano {

    @Override
    public void playScale() {
        System.out.println("Playing A minor scale on electric piano.");
    }
}
