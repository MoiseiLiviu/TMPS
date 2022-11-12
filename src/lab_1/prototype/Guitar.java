package lab_1.prototype;


public class Guitar implements Cloneable {

    private String strings;
    private String color;
    private String brand;
    private Integer numberOfStrings;

    public Guitar(String strings, String color, String brand, Integer numberOfStrings) {
        this.strings = strings;
        this.color = color;
        this.brand = brand;
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "strings='" + strings + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", numberOfStrings=" + numberOfStrings +
                '}';
    }
}
