package ex_25_OOPs_Abstraction_Interface;

public class Lab185_Multiple_Inheritance_Interface {

}

interface Mother {
    void money();
}

interface Father {
    void money();
}

class Child implements Mother, Father {

    @Override
    public void money() {
        System.out.println("Child's Money!");
    }
}