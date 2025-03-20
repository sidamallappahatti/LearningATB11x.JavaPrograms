package ex_10_For_Loop;

public class Lab102_For_Loop_Break {
    public static void main(String[] args) {

        // break - it is used to come out of the loop
        for (int i = 0; i < 50; i++) {
            if (i == 5) {
                System.out.println(i);
                break;
            }
        }
    }
}
