package ex_25_OOPs_Abstraction_Interface;

public class Lab187_Abstract {

}

class ConcreteClass implements Incomplete_Interface {

    @Override
    public void display() {
    }
}

interface Incomplete_Interface {
    int a = 10;

    void display();
}
