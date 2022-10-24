package lab_1.Factory;

public abstract class GuitaristsGuild {

    protected abstract Guitarist getGuitarist();

    public void shred(){
        Guitarist guitarist = getGuitarist();
        guitarist.playPentatonic();
    }
}
