package Tasks;

public class Task007_CLI_Options_Max {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int max = num1 > num2 ? num1 : num2;
        System.out.println("Maximum number is:" + max);

    }
}
