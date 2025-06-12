package ex_30_Exceptions;

public class Lab223_Try_Catch_Multiple_Interview {
    public static void main(String[] args) {

        System.out.println("Start");
        try {
            int a=10/0;
        } catch (Exception e) {
            System.out.println("Can't be divide by zero");
        }

//         Not possible as Big Exception is used before
//        catch (ArithmeticException e){
//            System.out.println("Can't be divide by zero");
//        }
    }
}
