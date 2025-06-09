package ex_24_OOPs_Abstraction;

public class Lab180_Abstraction {

    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();
        c.loan25k();

        // Father f=new Father(); // 'Father' is abstract; cannot be instantiated
        Father f2 = new Child();
    }
}

abstract class Father {

    abstract void loan50k();

    void loan25k() {
        System.out.println("Given 25k");
    }
}

class Child extends Father {

    @Override
    void loan50k() {
        System.out.println("Child will pay the loan");
    }
}