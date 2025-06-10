package ex_27_OOPs_Static;

public class Lab189_Static_IIB {
    public static void main(String[] args) {
        P p = new P();
        P p1 = new P();
        P p2 = new P();

        // IIB -> 2 times
        // SIB -> 1 time Static will be called 1 time even if you multiple objects
    }
}

class P {
    {
        System.out.println("IIB");
    }

    P() {
        System.out.println("Default Constructor");
    }

    static {
        System.out.println("Static Initialization Block");
    }

}