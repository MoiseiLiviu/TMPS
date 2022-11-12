package lab_2.domain.models.guitarist;

public class WarmupGuitaristDecorator extends Guitarist{

    private final Guitarist guitarist;

    public WarmupGuitaristDecorator(Guitarist guitarist) {
        super(guitarist.guitar);
        this.guitarist = guitarist;
    }

    @Override
    public void perform() {
        System.out.println("Plays scale to warm up before performing");
        guitarist.perform();
    }
}
