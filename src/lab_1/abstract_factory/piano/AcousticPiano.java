package lab_1.abstract_factory.piano;

public class AcousticPiano implements Piano {

    @Override
    public void playScale() {
        System.out.println("Playing A minor scale on acoustic piano.");
    }
}
