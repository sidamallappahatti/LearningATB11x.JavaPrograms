package ex_20_OOPs_Polymorphism.MethodOverLoading;

public class Lab172_REAL_MethodOverLoading {
    public static void main(String[] args) {
        Home h = new Home();
        h.task(2);
        h.task(3, 4, 8);
    }
}

class Home {
    void task(int a) {
        System.out.println(a);
    }

    void task(int a, int b) {
        System.out.println(a + b);
    }

    void task(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
