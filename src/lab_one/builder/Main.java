package lab_one.builder;

public class Main {

    public static void main(String[] args) {

        Guitar guitar = new Guitar.GuitarBuilder()
                .strings("steel")
                .brand("Ibanez")
                .color("red")
                .numberOfStrings(8)
                .build();
        System.out.println(guitar);
    }
}
