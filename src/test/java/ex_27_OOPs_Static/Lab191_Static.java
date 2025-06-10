package ex_27_OOPs_Static;

public class Lab191_Static {
    public static void main(String[] args) {
        B.commonToAll();
        B b_ref = new B();
        b_ref.display();

        System.out.println(B.b);
        System.out.println(b_ref.a);
    }
}

class B {
    static {
        System.out.println("SIB, called once the class is loaded");
    }

    int a = 10;
    static int b = 10;

    void display() {
        System.out.println(b);
        System.out.println("Non Static function");
    }

    static void commonToAll() {
//        System.out.println(a);// This is not possible, can't use non-static variables in static function
        System.out.println("Static function");
    }

//    static class C{
//        //Not useful
//    }

}
