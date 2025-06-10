package ex_29_Wrapper_Class;

public class Lab197_Wrapper_Conversion {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a; // This is Boxing -> automatically JVM will store the value
        // primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue());//Behaviour
        System.out.println(Integer.MIN_VALUE);//Behaviour

        Integer a1 = 45;
        int b1 = a1;  // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(b1);

    }
}
