package ex_09_Switch;

public class Lab084_Interview {
    public static void main(String[] args) {
        int a=50;
        switch (a){
            case 50:
                System.out.println("50");
//          case 50:
//                System.out.println("50");

        }
    }
}

//This code will not compile and will produce the following compilation error:
//Error: duplicate case label

//Why?
//Each case must have a unique value.
//The compiler does not allow duplicate case labels because only one case can match a given value.