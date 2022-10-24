package lab_1.Prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        MonkeyPox monkeyPox = new MonkeyPox(100, "Brain", 20);
        MonkeyPox monkeyPox1 = (MonkeyPox) monkeyPox.clone();
        System.out.println(monkeyPox);
        System.out.println(monkeyPox1);
    }
}
