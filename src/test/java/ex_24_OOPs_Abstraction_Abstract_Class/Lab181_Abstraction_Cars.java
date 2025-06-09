package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab181_Abstraction_Cars {

    public static void main(String[] args) {
        WagonR car=new WagonR();
        car.drive();
    }
}

abstract class Engine{

    abstract void startEngine();
    abstract void stopEngine();

    void normal_function(){
        System.out.println("Normal function");
    }
}

class WagonR extends Engine{

    @Override
    void startEngine() {
        System.out.println("Starting the car");
    }

    @Override
    void stopEngine() {

        System.out.println("Stopping the car");
    }

    void drive(){
        startEngine();
        stopEngine();
    }

}// Complete method - No Abstract method