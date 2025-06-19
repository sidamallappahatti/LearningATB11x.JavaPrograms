package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab253_ArrayList_Students {
    public static void main(String[] args) {
        Students s = new Students("Amar", 1);
        Students s1 = new Students("Bhanu", 2);
        Students s2 = new Students("Siddu", 3);

        List<Students> myStudents = new ArrayList<>();
        myStudents.add(s);
        myStudents.add(s1);
        myStudents.add(s2);

        System.out.println(myStudents);

        s.printDetails();
        s1.printDetails();
        s2.printDetails();

    }
}
