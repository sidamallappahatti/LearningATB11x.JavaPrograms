package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab250_ArrayList_Interview {
    public static void main(String[] args) {

        List marks = new ArrayList();

        marks.add(77);
        marks.add(93);
        marks.add(88);
        marks.add(89);
        marks.add(95);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);

        // Collection - Interface
        // Collections - Class (it contains complete methods which list,set, queue may required)

        Collections.sort(marks, Collections.reverseOrder());
        System.out.println(marks);

    }
}
