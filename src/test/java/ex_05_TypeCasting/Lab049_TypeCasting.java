package ex_05_TypeCasting;

import java.util.Scanner;

public class Lab049_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid syntax -> smaller data into the bigger data type
        // Implicit - Casting - Widening
        System.out.println(a);
        long l=a;
        System.out.println(l);
        double d=b;
        System.out.println(d);
        }
    }
