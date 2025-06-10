package ex_28_ENUM;

import ex_19_OOPs_Inheritance.Multilevel_Inheritance.Son;

public class Lab194_ENUM {

    public static void main(String[] args) {
        System.out.println(Day.FRIDAY);
        System.out.println(Project_URLs.katalon);

//        A a= new A();
//        System.out.println(a.days[4]);
    }
}

//class A{
//    String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
//}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum Project_URLs {
    google, restAssured, katalon, vwo
}