package ex_02_java_basics_02;

public class Lab019_printF {
    public static void main(String[] args) {
        int a = 10;
        System.out.printf("Your variable is %d",a);
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
        int b = 20;
        System.out.println( " --- ");
        System.out.printf("%d + %d\n",a,b);

        String name="Siddu";
        System.out.printf("your name is %s\n",name);
    }
}
