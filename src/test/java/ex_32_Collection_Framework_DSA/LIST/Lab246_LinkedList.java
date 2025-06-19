package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab246_LinkedList {
    public static void main(String[] args) {

        List al = new ArrayList<>(5);
        List al1 = new ArrayList<>();  // Arrays Format - Continuous

        List mylist = new LinkedList();

        mylist.add("Siddu");
        mylist.add("Hatti");
        mylist.add(12);
        mylist.add("55");
        mylist.add(true);
        mylist.add(null);
        System.out.println(mylist);

        System.out.println(mylist.isEmpty());
        System.out.println(mylist.size());
        System.out.println(mylist.contains("Siddu"));
        System.out.println(mylist.indexOf("55"));

    }
}
