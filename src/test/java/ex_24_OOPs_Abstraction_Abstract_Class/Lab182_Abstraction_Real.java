package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab182_Abstraction_Real {


}

abstract class Employee {

    private String name;
    private String address;
    private int number;

    Employee() {

        System.out.println("Default Constructor");
    }

    Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double computePay();

    void mailCheck() {
        System.out.println("Mailing a check to " + this.number + " " + this.address);
    }

}

class C1 extends Employee {

    @Override
    double computePay() {
        return 0;
    }
}