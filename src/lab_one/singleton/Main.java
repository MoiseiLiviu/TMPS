package lab_one.singleton;

public class Main {

    public static void main(String[] args) {
        Coach coach = Coach.getInstance();
        System.out.println(coach.toString());
    }
}
