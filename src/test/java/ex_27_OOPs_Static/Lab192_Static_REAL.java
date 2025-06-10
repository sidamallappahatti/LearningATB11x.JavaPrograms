package ex_27_OOPs_Static;

public class Lab192_Static_REAL {
    public static void main(String[] args) {

        System.out.println(ATB.courseName);
        System.out.println(ATB.mentorName);

        ATB.assignment();
        ATB.joinZoomForClass();

        ATB siddu = new ATB();
        siddu.setName("Siddu");
        siddu.setPhone("9876543210");

        ATB ram = new ATB();
        ram.setName("Ram");
        ram.setPhone("8976543210");
    }
}

class ATB {
    static {
        System.out.println("Load the class?, I will execute");
    }

    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name; // non static
    private String phone;
    static String courseName = "ATB11X";
    static String mentorName = "Mentor";

    static void assignment() {
        //System.out.println(phone); // Static method can't access the non-static variables
        System.out.println("Do Assignment");
    }

    void assignmentSolution() {
        System.out.println("It's different");
    }

    static void joinZoomForClass() {
        //System.out.println(phone); // Static method can't access the non-static variables
        System.out.println("Class joined");
    }
}