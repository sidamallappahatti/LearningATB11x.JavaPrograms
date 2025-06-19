package ex_32_Collection_Framework_DSA.LIST;

import java.util.*;

public class Lab247_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector<>(10);

        v.add("Siddu Hatti");
        v.add("Hatti");
        v.add("007");
        System.out.println(v);
        v.remove(1);
        System.out.println(v);
        System.out.println(v.contains("Hatti"));

        System.out.println("========");

        System.out.println("==Normal for loop==");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

        System.out.println("==For each loop==");
        for (Object o : v) {
            System.out.println(o);
        }

        System.out.println("==Iterator==");
        Iterator iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("==Enumeration==");
        Enumeration<Object> enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("==ListIterator==");
        ListIterator listIterator = v.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("==\nBackward Direction==");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
