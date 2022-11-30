package lab_3.model;

public class Guitar {

    private String color;
    private String stringsType;
    private int numberOfStrings;
    private String humbucker;

    public void setColor(String color) {
        this.color = color;
    }

    public void setStringsType(String stringsType) {
        this.stringsType = stringsType;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void setHumbucker(String humbucker) {
        this.humbucker = humbucker;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "color='" + color + '\'' +
                ", stringsType='" + stringsType + '\'' +
                ", numberOfStrings=" + numberOfStrings +
                ", humbucker='" + humbucker + '\'' +
                '}';
    }
}
