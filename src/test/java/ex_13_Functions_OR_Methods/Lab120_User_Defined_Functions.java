package ex_13_Functions_OR_Methods;

public class Lab120_User_Defined_Functions {
    public static void main(String[] args) {

        // User Defined Functions.

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        // 1.Without Parameters and Without Return Type
        wop_wort_greet();

        // 2.Without Parameters but With Return Type

        String msg = wop_wrt_greet();
        System.out.println(msg);

        // 3.With Parameters and Without Return Type
        wp_wort_details("Siddu", 25, 80000);
        wp_wort_details("Ram", 26, 100000);


        // 4. With Parameters and With Return Type
        int sum = sum_of_two(2, 2);
        System.out.println(sum);


    }

    // 1.Without Parameters and Without Return Type
    static void wop_wort_greet() {
        System.out.println("Hi");
    }

    // 2.Without Parameters but With Return Type
    static String wop_wrt_greet() {
        return "Hi with return but without parameter";
    }

    // 3.With Parameters and Without Return Type
    static void wp_wort_details(String name, int age, double salary) {

        System.out.println("Your name is ->" + name + "\nYour age is " + age + "\nYour salary is " + salary);
    }

    static void greet_with_full_name(String firstname, String lastname) {
        System.out.println("Hi, Your name is " + firstname + lastname);
    }

    // 4. With Parameters and With Return Type
    static int sum_of_two(int a, int b) {
        return a + b;
    }
}
