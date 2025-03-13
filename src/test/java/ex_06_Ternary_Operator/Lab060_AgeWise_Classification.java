package ex_06_Ternary_Operator;

import java.util.Scanner;

public class Lab060_AgeWise_Classification {
    public static void main(String[] args) {
        // age = 23 ->
        // Adult  ( age > 18) ,
        // Minor (age  <18), Senior
        // ( age > 65)
        // take an input from user
//        String age1 = args[0];
//        System.out.println(age1);
//        System.out.println(age1 instanceof String);
//
//        int age = Integer.parseInt(age1);
//
//        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
//        System.out.println(result);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();

        String result=age<18? "Minor":(age<65?"Adult":"Senior");
        System.out.println(result);


    }
}
