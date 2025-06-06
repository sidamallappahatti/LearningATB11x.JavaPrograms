package ex_30_Exceptions;

public class Lab217_Exceptions_Explained {

    public static void main(String[] args) {
        System.out.println("Starting the program");
        String user_input=args[0];//java.lang.ArrayIndexOutOfBoundsException
        int a =Integer.parseInt(user_input);// java.lang.NumberFormatException: For input string: "Siddu"
        int output =100/a;//java.lang.ArithmeticException
        System.out.println(output);
        System.out.println("End of the program");

        // divide by zero -> ?

        // java.lang.ArithmeticException: / by zero when args -> 0
        // java.lang.NumberFormatException: For input string: "Siddu"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
    }
}
