package ex_30_Exceptions;

public class Lab224_Try_Interview {
    public static void main(String[] args) {

        try {
            String s1 = null;
//            int a=10/0;
            System.out.println(s1.length());
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
