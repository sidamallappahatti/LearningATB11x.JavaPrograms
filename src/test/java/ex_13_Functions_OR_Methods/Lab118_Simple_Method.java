package ex_13_Functions_OR_Methods;

public class Lab118_Simple_Method {
    public static void main(String[] args) {
        siddu();
//      int result=siddu();
        int value = return_int();
        System.out.println(value);

        float pi_value = return_float_pi_value();
        System.out.println(pi_value);

        String str=return_String();
        System.out.println(str);
    }

    static void siddu() {
        System.out.println("No Return");
    }

    static int return_int() {
        return 10;
    }

    static boolean return_boolean() {
        return true;
    }

    static float return_float_pi_value() {
        return 3.14f;
    }

    static byte return_byte() {
        return 100;
    }

    static long return_long() {
        return 10l;
    }

    static String return_String() {
        return "Siddu";
    }

}
