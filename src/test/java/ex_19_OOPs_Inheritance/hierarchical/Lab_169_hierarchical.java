package ex_19_OOPs_Inheritance.hierarchical;

public class Lab_169_hierarchical {
    public static void main(String[] args) {

        Father f1 = new Father();
        f1.home();

        Siddu s1 = new Siddu();
        s1.home();
        s1.h2();

        Ram r1 = new Ram();
        r1.r2();
        r1.home();

        Shiva s = new Shiva();
        s.s2();
        s.home();

    }
}

class Father {
    void home() {
        System.out.println("3BHK");
    }
}

class Siddu extends Father {
    void h2() {
        System.out.println("Siddu H2");
    }
}

class Ram extends Father {
    void r2() {
        System.out.println("Ram");
    }
}

class Shiva extends Father {
    void s2() {
        System.out.println("Shiva");
    }
}
