package lab_1.AbstractFactory.piano;

public class ElectricPiano implements Piano {

    @Override
    public void playScale() {
        System.out.println("Playing A minor scale on electric piano.");
    }
}
