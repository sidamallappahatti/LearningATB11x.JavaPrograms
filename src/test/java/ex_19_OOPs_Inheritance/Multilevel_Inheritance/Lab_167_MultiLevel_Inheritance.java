package ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab_167_MultiLevel_Inheritance {
    public static void main(String[] args) {

//        Son s1= new GrandFather();
//        Son s2= new Father();

        Son siddu= new Son();

        GrandFather gf1= new Son();  // Dynamic Dispatch--> We can create subclass object with super class reference
        gf1.grandFather();
        gf1.home();

        GrandFather gf2= new Father();
        gf2.home();

        Father f2=new Son();
        f2.home();

        // Father f3 = new GrandFather();

        // WebDriver driver = new ChromeDriver();

    }
}
