package ex_08_If_Condition;

import java.util.Scanner;

public class Lab073_If_Ex1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();

        if (age >= 18){
            System.out.println("Yes you can go to GOA!");
        }else {
            System.out.println("You can't Go to GOA!!");
        }
    }
}
