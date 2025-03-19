package ex_09_Switch;

import java.util.Scanner;

public class Lab078_Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7)");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
        }
    }
}

//nothing happens because those cases are missing, and there's no default.
//If there is default case, the default case catches any missing cases.