package lab_1.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Guitar guitar = new Guitar("nylon", "red", "Ibanez", 6);
        Guitar guitar1 = (Guitar) guitar.clone();
        System.out.println(guitar);
        System.out.println(guitar1);
    }
}
