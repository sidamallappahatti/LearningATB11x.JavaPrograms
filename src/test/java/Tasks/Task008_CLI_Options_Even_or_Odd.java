package Tasks;

public class Task008_CLI_Options_Even_or_Odd {
    public static void main(String[] args) {


        int num = Integer.parseInt(args[0]);

        String even_or_odd = (num % 2 == 0 ? "Even" : "Odd");
        System.out.println("Given input is:" + even_or_odd);

    }
}
