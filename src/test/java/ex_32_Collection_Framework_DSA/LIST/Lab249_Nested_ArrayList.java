package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab249_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Cherry");
        System.out.println(fruits);

        List<String> fruits1=new ArrayList<>();
        fruits1.add("Mango");
        fruits1.add("Grapes");
        fruits1.add("Papaya");
        System.out.println(fruits1);

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Tomato");
        vegetables.add("Potato");
        vegetables.add("Onion");
        System.out.println(vegetables);

    }
}
