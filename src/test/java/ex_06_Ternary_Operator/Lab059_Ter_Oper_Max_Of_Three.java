package ex_06_Ternary_Operator;

public class Lab059_Ter_Oper_Max_Of_Three {
    public static void main(String[] args) {

        int a = 15;
        int b = 20;
        int c = 30;

        int max=(a>b? (a>c? a:c):(b>c?b:c));
        System.out.println("Max is "+max);

    }
}
