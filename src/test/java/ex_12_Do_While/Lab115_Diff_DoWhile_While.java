package ex_12_Do_While;

public class Lab115_Diff_DoWhile_While {
    public static void main(String[] args) {
        int a = 0;
//        while (a<0){
//            System.out.println(a);
//            a++;
//        }

        do {
            System.out.println("This is a do Body, Which will execute 1 time");
            System.out.println(a);
            a++;
        } while (a < 0);
    }
}

