package ex_30_Exceptions;

import java.util.Scanner;

public class Lab234_Throw {
    public static void main(String[] args) {
        boolean canIGoToGoa = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("You can't go, you are under age");
//            throw new NotValidAgeException("NOt valid age");
        }
    }
}
