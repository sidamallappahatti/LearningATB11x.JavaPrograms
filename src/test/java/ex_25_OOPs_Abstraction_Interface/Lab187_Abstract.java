package ex_25_OOPs_Abstraction_Interface;

public class Lab187_Abstract {

}

class ConcreteClass implements Incomplete_Interface {

    @Override
    public void display() {
    }
}

interface Incomplete_Interface {
    int a = 10;// Final

    void display();

    default void display1() {
        System.out.println("Default is allowed");
    }

    static void display2() {
        System.out.println("Default is allowed");
    }
}

abstract class Incomplete_abstract {
    int a = 10;//Not a final value

    abstract void display3();

    void display4() {
    }

    Incomplete_abstract() {
    }

}