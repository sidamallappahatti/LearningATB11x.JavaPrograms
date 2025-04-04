package ex_19_OOPs_Inheritance;

public class Lab_164_Inheritance {
    public static void main(String[] args) {
        Father f = new Father();
        System.out.println(f.gold_f);
        f.bhk2();
//        f.bhk3();

        Son s = new Son();
        s.bhk3();

        // Son can access father's gold (attribute) and 2BHK(Property) by using extend keyword
        System.out.println(s.gold_f);
        s.bhk2();
    }

}

class Father {

    // Attribute | Data variables |  Property | Instance Variables
    int gold_f = 1000;

    //  Behaviour |  Method | Function | Data members
    void bhk2() {
        System.out.println("2BHK of Father");
    }

}

class Son extends Father {
    void bhk3() {
        System.out.println("3BHK of Son");
    }
}
