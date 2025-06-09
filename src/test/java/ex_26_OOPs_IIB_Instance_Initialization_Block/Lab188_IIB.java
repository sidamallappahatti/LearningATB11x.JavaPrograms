package ex_26_OOPs_IIB_Instance_Initialization_Block;

public class Lab188_IIB {

    //IIB ==> Instance initialization Block
    //I will be executed when Object is created

    public static void main(String[] args) {
        new A1();
    }
}

class A1{
    A1(){
        System.out.println("Default Constructor");
    }

    {
        System.out.println("Hi, I am first IIB");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file
    }
    {
        System.out.println("Hi, I am Second IIB");
    }

    {
        System.out.println("Hi, I am Third IIB");
    }

}
