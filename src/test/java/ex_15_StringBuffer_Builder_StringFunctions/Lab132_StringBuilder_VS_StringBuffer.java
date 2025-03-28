package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab132_StringBuilder_VS_StringBuffer {

    public static void main(String[] args) {

        String s0="Siddu";
        String s1=new String("Siddu");

        StringBuilder stringBuilder=new StringBuilder("Siddu");
        StringBuffer stringBuffer=new StringBuffer("Siddu");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer);

    }
}
