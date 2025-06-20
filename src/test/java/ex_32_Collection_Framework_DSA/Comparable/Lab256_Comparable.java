package ex_32_Collection_Framework_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lab256_Comparable {
    public static void main(String[] args) {

        Student s1 = new Student(107, "Siddu", 27);
        Student s2 = new Student(104, "Ram", 29);
        Student s3 = new Student(106, "Ajay", 23);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList);
        System.out.println(studentList);

        System.out.println("===Iterator===");
        //Iterator
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // For each loop
        System.out.println("===For each loop===");

        for (Student s : studentList) {
            System.out.println(s);
        }

    }
}

class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + ", age=" + age + '}';
    }

//    @Override
//    public int compareTo(Student o){
//        return this.rollNo-o.rollNo;
//    }

//    @Override
//    public int compareTo(Student o) {
//        return this.age-o.age;
//    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
