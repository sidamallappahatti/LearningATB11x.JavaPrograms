package ex_18_OOPS_Constructor;

public class Lab_159_Constructor_2 {
    public static void main(String[] args) {
        WebAutomation w = new WebAutomation();

    }

}

class WebAutomation {

    //Default Constructor
    WebAutomation() {
        System.out.println("I wanna read CSV file");
        System.out.println("Open the page before loading the script");
        System.out.println("You can do anything you want to do it doesn't matter,when object is created");

//        FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}
