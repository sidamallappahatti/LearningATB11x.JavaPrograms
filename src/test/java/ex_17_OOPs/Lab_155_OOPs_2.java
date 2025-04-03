package ex_17_OOPs;

public class Lab_155_OOPs_2 {
    public static void main(String[] args) {
        Student s = new Student();
        String name = s.name = "Ram";
        System.out.println(name);

        //1. Student - Class Loading
        //2. s - Object Reference
        //3. new Student() -> Object creation
    }
}

class Student {
    String name;
    int roll_no;

    void read() {
    }

}
