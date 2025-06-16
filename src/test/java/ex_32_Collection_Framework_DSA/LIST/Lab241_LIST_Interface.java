package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab241_LIST_Interface {
    public static void main(String[] args) {

//        List fruits=new List();

        List fruits = List.of("Orange", "apple", "mango", "Banana", "Watermelon");
        System.out.println(fruits);
//        fruits.add("Chikku");   //java.lang.UnsupportedOperationException
//        fruits.remove("mango");  // Not possible

        List l = new ArrayList();  // Dynamic Diapatch
        ArrayList l2=new ArrayList();
        l.add("Hello");
        l.add(123);
        l.add(true);
        l.add('a');

        System.out.println(l);

    }
}
