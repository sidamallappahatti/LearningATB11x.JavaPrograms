package ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab_166_MultiLevel_Inheritance {
    public static void main(String[] args) {

        GrandFather gf=new GrandFather();
        gf.grandFather();

        System.out.println("========");

        Father f= new Father();
        f.father();

        System.out.println("========");

        Son s= new Son();
        s.son();
        s.father();
        s.grandFather();

    }
}
