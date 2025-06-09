package ex_25_OOPs_Abstraction_Interface;

public class Lab184_Interface {
    public static void main(String[] args) {
        Car c=new Car();
        c.drive();
    }
}

class Car implements Brakes,Engine{

    void drive(){
        startEngine();
        applyBrake();
        stopEngine();
    }

    @Override
    public void applyBrake() {
        System.out.println("Apply Break");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }
}

interface Brakes{
    void applyBrake();
}

interface Engine{
    void startEngine();
    void stopEngine();
    default void test(){
        System.out.println("Concrete complete");
    }
}