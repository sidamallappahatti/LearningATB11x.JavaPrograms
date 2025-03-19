package ex_09_Switch;

import java.util.Scanner;

public class Lab077_Switch_Without_break {
    public static void main(String[] args) {
        // Switch
        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error

        //int day = Integer.parseInt(args[0]); - CLI option

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number (1 to 7)");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Mon");
                
            case 2:
                System.out.println("Tue");
                
            case 3:
                System.out.println("Wed");
                
            case 4:
                System.out.println("Thu");
                
            case 5:
                System.out.println("Fri");
                
            case 6:
                System.out.println("Sat");
                
            case 7:
                System.out.println("Sun");
                
            default:
                System.out.println("You have entered invalid day number");
                

        }
    }
}
//If you don't use break; in a switch statement, case fall-through occurs.
//This means that once a matching case is found, all subsequent cases will execute until a break;
//or the end of the switch block is reached.