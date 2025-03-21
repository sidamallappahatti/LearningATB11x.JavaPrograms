package ex_13_Functions_OR_Methods;

public class Lab119_User_Defined_Functions {
    public static void main(String[] args) {

        int sum1=sum_of_two_numbers(3,5);
        int sum2=sum_of_two_numbers(2,2);

        System.out.println(sum1);
        System.out.println(sum2);

    }
    static int sum_of_two_numbers(int a,int b){
       return a+b;
    }
}
