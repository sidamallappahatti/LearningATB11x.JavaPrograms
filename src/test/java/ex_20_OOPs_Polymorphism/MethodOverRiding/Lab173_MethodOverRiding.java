package ex_20_OOPs_Polymorphism.MethodOverRiding;

public class Lab173_MethodOverRiding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

class animal {
    void sound() {
        System.out.println("Animal Sound!");
    }
}

class Dog extends animal {

    @Override
    void sound() {
        System.out.println("Bark!");
    }
}
