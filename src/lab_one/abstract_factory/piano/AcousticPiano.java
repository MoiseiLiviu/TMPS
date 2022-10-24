package lab_one.abstract_factory.piano;

public class AcousticPiano implements Piano {

    @Override
    public void playScale() {
        System.out.println("Playing A minor scale on acoustic piano.");
    }
}
