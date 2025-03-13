package ex_05_TypeCasting;

import java.util.Scanner;

public class Lab051_TypeCasting_2 {
    public static void main(String[] args) {

        long phone_no = 8970500307l;
        //short s = phone_no; // implicit ?
        short s = (short) phone_no; // Explicit Casting - Narrowing
        System.out.println(s);

        }
    }


