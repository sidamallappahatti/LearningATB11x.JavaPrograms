package ex_01_java_basics;
import java.math.BigDecimal;

public class Big_decimal {

    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("4.3");  // Using string to avoid precision issues
        BigDecimal num2 = new BigDecimal("3");
        BigDecimal result = num1.multiply(num2);

        System.out.println(result);

    }
}
