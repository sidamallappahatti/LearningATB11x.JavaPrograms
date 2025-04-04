package ex_18_OOPS_Constructor;

public class Lab_160_DefaultConstructor {
    public static void main(String[] args) {

        A a=new A();
    }
}
class A{
    A(){
        System.out.println("Default constructor is called on just creating object");
    }
}
