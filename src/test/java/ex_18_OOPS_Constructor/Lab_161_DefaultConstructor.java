package ex_18_OOPS_Constructor;

import javax.xml.namespace.QName;

public class Lab_161_DefaultConstructor {
    public static void main(String[] args) {

       Car car1=new Car();
       car1.brand="BMW";
        System.out.println(car1.brand);
        System.out.println(car1.year);

        System.out.println("===========");

        Car car2=new Car();
        car2.brand="Audi";
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.isEV);

        System.out.println("===========");

        Car car3=new Car();


    }
}
class Car{
    String brand;
    String model;
    int year;
    String fuelType;
    Boolean isEV;

    Car(){
        brand="Unknown";
        model="RS Q8";
        year=2025;
        fuelType="Petrol";
        isEV=false;

        System.out.println("Default constructor\n"+brand+"\n"+fuelType);

    }
}