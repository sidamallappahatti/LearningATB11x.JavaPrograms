package ex_32_Collection_Framework_DSA.MAP;

import java.util.*;

public class Lab261_Map {
    public static void main(String[] args) {
        Map map = new HashMap();
        //Map is Key and Value pair

        map.put("Name", "Siddu");
        map.put("RollNo", 1);
        map.put("PhoneNo", 897050030);

        System.out.println(map);

        System.out.println("== LinkedHashMap ==");
        Map map1 = new LinkedHashMap();
        map1.put("Name", "Siddu");
        map1.put("RollNo", 1);
        map1.put("PhoneNo", 897050030);

        System.out.println(map1);

        System.out.println("== TreeMap ==");

        Map map2 = new TreeMap();
        map2.put("FirstName", "Siddu");
        map2.put("LastName", "Siddu");
        map2.put("RollNo", 1);
        map2.put("PhoneNo", 897050030);
        System.out.println(map2);

    }
}
