package ex_21_OOPs_Encapsulation;

public class Lab176_Encapsulation {

    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank("Siddu", 9900000);
        long bal = iciciBank.getBal();
        System.out.println(bal);

        iciciBank.setBal(7700000);
        System.out.println(iciciBank.getBal());
    }
}

class ICICIBank {

    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        this.bal = bal;
    }
}
