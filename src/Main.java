public class Main {
    public static void main(String[] args) {
        int primaryBalance = 500;
        int addition = 1200;
        int bonus = 0;

        if (addition >1000) {
            bonus = addition / 100;
        }

        int finalBalance = primaryBalance + addition + bonus;

        System.out.println("bonus: " + bonus + ", finalBalance: " + finalBalance);
    }
}