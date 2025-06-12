package ex_30_Exceptions;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab232_Throws {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("c://a.txt");
        String s = null;
        s.trim();
        int a = 10 / 0;
        File file = new File("");
    }

    static void t() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("c:abc.txt");
    }
}
