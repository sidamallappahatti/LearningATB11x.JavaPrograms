package ex_10_For_Loop;

public class Lab104_For_Loop_Continue_Even_Numbers {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            if (i %2==0) {
                System.out.println("It's even: "+i);

                continue; // skip below code, move to top
            }
            System.out.println("It's odd: "+i);
        }
    }
}
