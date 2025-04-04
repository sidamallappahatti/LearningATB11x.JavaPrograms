package ex_18_OOPS_Constructor;

public class Lab_162_Parameterized_Constructor {

    public static void main(String[] args) {
        Car1 c1=new Car1();
        Car1 c2=new Car1();

        System.out.println(c1.name);
        System.out.println(c2.name);

        Car1 c3= new Car1("Maruti","suzuki",2025);
        System.out.println(c3.name);
        System.out.println(c3.model);

        Car1 c4= new Car1("Tata","Harrier",2024);
        System.out.println(c4.name);
        System.out.println(c4.model);

        Car1 c5= new Car1("Tata","Safari",2024);
        System.out.println(c5.name);
        System.out.println(c5.model);
        System.out.println(c5.year);



    }
}

class Car1{

    String name;
    int year;
    String model;

    Car1(){

        model="d750";
        name="BMW";
        year=2025;

//        System.out.println("Default Constructor");
    }


    // Parameterized Constructor
    Car1(String name, String model, int year){
        this.name=name;
        this.model=model;
        this.year=year;

    }

}
