package lab_1.Singleton;

public class Main {

    public static void main(String[] args) {
        Coach coach = Coach.getInstance();
        System.out.println(coach.toString());
    }
}
