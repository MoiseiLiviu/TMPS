package lab_one.builder;

public class Guitar {

    private String strings;
    private String color;
    private String brand;
    private Integer numberOfStrings;

    private Guitar(GuitarBuilder guitarBuilder){
        this.color = guitarBuilder.color;
        this.numberOfStrings = guitarBuilder.numberOfStrings;
        this.brand = guitarBuilder.brand;
        this.strings = guitarBuilder.strings;
    }


    public static class GuitarBuilder {

        private String strings;
        private String color;
        private String brand;
        private Integer numberOfStrings;

        public GuitarBuilder strings(String strings) {
            this.strings = strings;
            return this;
        }

        public GuitarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public GuitarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public GuitarBuilder numberOfStrings(Integer numberOfStrings) {
            this.numberOfStrings = numberOfStrings;
            return this;
        }

        public Guitar build(){
            return new Guitar(this);
        }
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
