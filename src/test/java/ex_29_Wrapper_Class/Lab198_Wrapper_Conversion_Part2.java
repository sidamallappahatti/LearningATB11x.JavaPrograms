package ex_29_Wrapper_Class;

public class Lab198_Wrapper_Conversion_Part2 {
    public static void main(String[] args) {
        String num = "10";
        int a = 10;

        // String -> Wrapper -> parseX()  ,   Integer.parseInt(num);Double.parseDouble()
        Integer i = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);

        // String to Primitive
        int aa = Integer.parseInt(num);

        // Wrapper to String (toString method)
        System.out.println(i.toString());

        // Primitive to String
        int age = 15;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());

    }
}
