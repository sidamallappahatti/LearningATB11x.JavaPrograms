package ex_31_Generics;

public class Lab237_Generics_Method {
    public static void main(String[] args) {
        temp_sum(4, 5);
        temp_sum(3.25, 1.25);
        temp_sum("Siddu", "Hatti");
    }

    static <G> G temp_sum(G a, G b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
