package ex_17_OOPs;

public class Lab_154_OOPs {

    public static void main(String[] args) {
        Person amit;
        Person p = new Person();
        //Person  - Class
        //p - Object reference
        // new Person()- Object

        p.name = "Siddu";
        System.out.println(p.name);

        Person p1 = new Person();
        p1.name = "Sid";
        System.out.println(p1.name);

        new Person().name = "Not ref";

    }

}

class Person {
    // Attribute | Properties |  Data Members | Instance variables
    String name;
    String phone;
    String color_eyes;
    int legs;
    double salary;
    byte age;
    double weight;
    boolean isMale;

    // Behaviour | Function | Method
    void sleep() {
        System.out.println("I'm sleeping");
    }

    String greet(String name) {
        return "Hello" + name;
    }

    void talk() {
        System.out.println("I'm talking");
    }

    int amount_inHand(int salary, int tax) {
        return salary - tax;
    }
}

