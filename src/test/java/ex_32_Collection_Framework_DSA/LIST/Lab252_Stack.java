package ex_32_Collection_Framework_DSA.LIST;

import java.util.Stack;

public class Lab252_Stack {
    public static void main(String[] args) {
        //Stack
        // List In -> First Out ( LIFO)

//        Stack s=new Stack();
//        s.add("Siddu");
//        s.add("Hatti");
//        System.out.println(s);

        Stack s = new Stack();
        s.push("Siddu");
        s.push("Hatti");
        s.push("Benz");
        s.push("Audi");

        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.add("Ram"));
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);
    }
}
