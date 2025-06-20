package ex_32_Collection_Framework_DSA.Comparator;

import java.util.*;

public class Lab257_Comparator {
    public static void main(String[] args) {

        Students s1 = new Students(107, "Siddu", 27);
        Students s2 = new Students(104, "Ram", 29);
        Students s3 = new Students(106, "Ajay", 23);
        Students s4 = new Students(101, "Bhakti", 25);

        List<Students> studentsList=new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);

//        Collections.sort(studentsList, new AgeComparator());
        Collections.sort(studentsList, new RollNoComparator());
//        Collections.sort(studentsList, new NameComparator());


        Iterator<Students> iterator=studentsList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

class AgeComparator implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getAge()-o2.getAge();
    }
}

class RollNoComparator implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getRollNo()-o2.getRollNo();
    }
}

class NameComparator implements Comparator<Students>{
    @Override
    public int compare(Students s1, Students s2) {
        return (s1.getAge())-(s2.getAge());
    }
}

class Students{
    private int rollNo;
    private String name;
    private int age;

    public Students(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
