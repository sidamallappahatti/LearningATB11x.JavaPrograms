package ex_14_String;

public class Lab128_String_Interview {

    public static void main(String[] args) {

        String s1="Hello";//String Constant Pool
        String s2="Hello";//String Constant Pool
        String s10="Hello";//String Constant Pool

        System.out.println(s10);

        String s3=new String ("Hello");//Object Area
        String s4=new String ("Hello");//Object Area
        String s5=new String ("Hello");//Object Area

        System.out.println(s4);

    }
}
