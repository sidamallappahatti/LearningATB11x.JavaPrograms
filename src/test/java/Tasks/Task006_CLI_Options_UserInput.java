package Tasks;

import java.util.Scanner;

public class Task006_CLI_Options_UserInput {
    public static void main(String[] args) {

//      User input using CLI
        String name = args[0];
        String age1 = args[1];
        String sal = args[2];

        System.out.println("Name:" + name);
        System.out.println("Age:" + age1);
        System.out.println("Salary:" + sal);

    }
}
