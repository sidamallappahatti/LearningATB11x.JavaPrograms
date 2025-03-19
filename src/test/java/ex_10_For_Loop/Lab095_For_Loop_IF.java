package ex_10_For_Loop;

public class Lab095_For_Loop_IF {
    public static void main(String[] args) {

        for (int age = 0; age < 18; age++) {
            if (age > 15) {
                System.out.println("Gift");
            } else {
                System.out.println("No Gift");
            }
        }
    }
}
