package ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab_168_MultiLevel_Inheritance {
    public static void main(String[] args) {

//      Son s1= new GrandFather();
//      Son s2= new Father();

        Son siddu = new Son();
        siddu.son();
        siddu.father();
        siddu.grandFather();
        System.out.println(siddu.gold_GF);

        Father f1 = new Father();
        f1.home();

        GrandFather gf1 = new GrandFather();
        gf1.home();

        GrandFather gf2 = new Son();
        gf2.home();

    }
}
