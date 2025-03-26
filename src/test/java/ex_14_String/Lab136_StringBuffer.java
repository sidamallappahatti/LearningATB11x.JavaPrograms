package ex_14_String;

public class Lab136_StringBuffer {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Siddu");
        sb.append("Hatti");
        System.out.println(sb);
        sb.delete(5,10);
        System.out.println(sb);
        sb.replace(3,5,"..");
        System.out.println(sb);

    }
}
