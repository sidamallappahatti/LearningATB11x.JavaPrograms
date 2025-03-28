package ex_16_Arrays;

public class Lab139_Arrays_2 {
    public static void main(String[] args) {
        String[] topics = {"Operators", "Loops", "Strings", "Arrays"};
        System.out.println(topics.length);
        System.out.println(topics[0]);
        System.out.println(topics[3]);
        System.out.println(topics[2]);

        String[] cities = new String[3];
        cities[0] = "Bangalore";
        cities[1] = "Goa";
        cities[2] = "Kashmir";

        System.out.println(cities[0]);
        System.out.println(cities[2]);
        System.out.println(cities[1]);

        boolean[] is_valid = new boolean[2];
        is_valid[0] = true;
        is_valid[1] = false;

        System.out.println(is_valid[0]);

    }
}
