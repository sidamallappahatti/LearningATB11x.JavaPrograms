package ex_27_OOPs_Static;

public class Lab190_Static {
    public static void main(String[] args) {
        A ref = new A(10);
        ref.displayValue();
        System.out.println(A.b);

        A.b = 45;

        System.out.println("=============");

        A ref1 = new A(20);
        ref1.displayValue();
        System.out.println(A.b);

        System.out.println("=============");

        A ref2 = new A(20);
        System.out.println(A.b);
    }

}

class A {
    int a; // non static -> instance variable / properties/ attribute / fields
    static int b = 20;

    A(int a) {
        this.a = a;
    }

    void displayValue() {
        System.out.println(this.a);

    }


}

