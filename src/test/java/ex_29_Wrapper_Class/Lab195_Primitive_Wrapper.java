package ex_29_Wrapper_Class;

public class Lab195_Primitive_Wrapper {

    public static void main(String[] args) {
        int a=10;//Primitive
        // This is not Object
        // It will not have attribute or BehaviourQ

        // char, short, byte, long, float, double, - we will avoid them now

        // We will use the Wrapper classes,
        // Character, Boolean, Short, Long, Double, Float

        Integer age=65;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(age);
        System.out.println(age.intValue());

    }
}
