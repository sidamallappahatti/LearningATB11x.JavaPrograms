package ex_32_Collection_Framework_DSA.MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab265_Hashtable {
    public static void main(String[] args) {
        // Map - K, V,  null values allows

        // Hashtable - Synchronised, Slow and Legacy Class - Thread Safe
        // T1, T2 - they will use one by one.

        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "one");
        ht.put(1, "one");
        ht.put(2, "two");
        ht.put(3, "three");
//        ht.put(4,null); //java.lang.NullPointerException
//        ht.put(null,"three");   //java.lang.NullPointerException
        System.out.println(ht);

        HashMap<Integer, String> ht1 = new HashMap<>();
        // Not Thread Safe, or Not Synchronised
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        ht1.put(3, null);
        ht1.put(null, null);
        System.out.println(ht1);

        System.out.println("----------");

        Enumeration<Integer> e = ht.keys();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}