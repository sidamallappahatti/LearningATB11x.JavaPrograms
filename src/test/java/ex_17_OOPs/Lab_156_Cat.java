package ex_17_OOPs;

public class Lab_156_Cat {

    public static void main(String[] args) {
        Cat c = new Cat();
        Cat c1;
        new Cat();
        c.running();
//      c1.running();

        new Cat().running();
        System.out.println(new Cat().name);
        System.out.println(new Cat().breed);
    }
}

class Cat {
    String name = "Bebo";
    String breed;// Null

    void running() {
        System.out.println("Running");
    }

}
