package ex_09_Switch;

import java.util.Scanner;

public class Lab079_Real_Switch_Automation {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser you want run scripts");
        String browser = sc.next();

        switch (browser) {

            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting firefox browser");
                break;
            case "edge":
                System.out.println("Starting edge browser");
                break;
            default:
                System.out.println("Invalid browser name");
                break;
        }
    }
}
