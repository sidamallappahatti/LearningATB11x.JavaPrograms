package ex_18_OOPS_Constructor;

public class Lab_163_Constructor_OverLoading {
    public static void main(String[] args) {
        Person p1= new Person("Siddu",897050037,"HBR Layout");
        Person p2= new Person("Ram",895250037,"HSR Layout");

        Person p3  = new Person();
        p3.name = "Shikha";
        System.out.println(p3.name);

        Person p4 = new Person("LUCKY",823424242);
        System.out.println(p4.address);


        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();
    }
}
class Person{

    String name;
    long phone;
    String address;

    Person(){
    }

    Person(String name_arg, long phone_arg, String address_arg){
        this.name=name_arg;
        this.phone=phone_arg;
        this.address=address_arg;

    }
    Person(String name, long phone){
        this.name=name;
        this.phone=phone;

    }

    void eat(){
        System.out.println(this.name+" is eating");
    }
}