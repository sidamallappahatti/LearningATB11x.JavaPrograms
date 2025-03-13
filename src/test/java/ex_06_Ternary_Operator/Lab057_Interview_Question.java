package ex_06_Ternary_Operator;

public class Lab057_Interview_Question {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int number = 8;
        String result = (number > 10) ? (number > 20 ? "N>20" : "N<20") : "B";

        System.out.println(result);

    }
}
