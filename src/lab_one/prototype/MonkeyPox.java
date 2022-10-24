package lab_one.prototype;

public class MonkeyPox implements Cloneable {

    private Integer timeToLive;
    private String organToAttack;
    private Integer spreadability;

    public MonkeyPox(Integer timeToLive, String organToAttack, Integer spreadability) {
        this.timeToLive = timeToLive;
        this.organToAttack = organToAttack;
        this.spreadability = spreadability;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "MonkeyPox{" +
                "timeToLive=" + timeToLive +
                ", organToAttack='" + organToAttack + '\'' +
                ", spreadability=" + spreadability +
                '}';
    }
}
