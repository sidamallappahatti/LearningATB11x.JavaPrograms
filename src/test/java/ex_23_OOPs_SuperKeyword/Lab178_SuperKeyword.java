package ex_23_OOPs_SuperKeyword;

public class Lab178_SuperKeyword {

    public static void main(String[] args) {
        Car c = new Car();
        c.display();

    }

}

class Vehicle {
    public int maxSpeed = 180;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Vehicle() {
        System.out.println("Default Constructor");
    }

    Vehicle(int a) {
        System.out.println("Parameterized Constructor");
    }

    // Method Overloading - same name function with different arguments.
    void message() {
        System.out.println("No Return, No Argument");
    }

    void message(int a) {
        System.out.println("PC - argument");
    }

    void display() {
        System.out.println("Vehicle Parent");
    }

}

class Car extends Vehicle {

    private int maxSpeed = 280;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Car() {
        super();
    }

    Car(int a) {
        super(10);
    }

    @Override
    void display() {

        System.out.println(this.maxSpeed);

        //Parent
        System.out.println(super.maxSpeed);
        super.message();
        super.message(10);
        super.display();

    }
}
