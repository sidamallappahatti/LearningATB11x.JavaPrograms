package ex_23_OOPs_SuperKeyword;

public class Lab179_SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}

class God {
    void sound() {
        System.out.println("God");
    }
}

class Animal extends God {

    protected String color = "White";

    void sound() {
        System.out.println("Animal sound");
        super.sound();
    }
}

class Dog extends Animal {

    private String color = "Black";

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();
        this.sound();
    }
}
