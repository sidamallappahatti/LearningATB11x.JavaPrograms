package ex_18_OOPS_Constructor;

public class Lab_158_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1=new Baby();
        new Baby();
        Baby b2;
    }

}

class Baby{

    // Attribute | Instance Variable |  Member variables, data members
    String name;

    //Behaviour
    void cry(){
        System.out.println("Cry!!");
    }
    void sleep(){
        System.out.println("Sleep!!");
    }

    void eat(){
        System.out.println("Eat");
    }

    //Default Constructor
    Baby(){
        System.out.println("I am called, Default constructor!");

        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)

    }
}
