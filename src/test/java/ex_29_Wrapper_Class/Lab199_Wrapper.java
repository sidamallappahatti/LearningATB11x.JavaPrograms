package ex_29_Wrapper_Class;

public class Lab199_Wrapper {
    public static void main(String[] args) {
        Mobile iphone = new Mobile(1, "iPhone 16 pro", 155000.00);
        Mobile samsung = new Mobile(2, "S24 Ultra", 135000.00);

        iphone.setPrice(200000.30);
        iphone.display();
        samsung.display();

        System.out.println(Mobile.mobile_carrier);
        Mobile.SwitchOnAirplaneMode();

    }
}

class Mobile extends oldPhone {
    private Integer phone;
    private String name;
    private Double price;
    static String mobile_carrier = "jio";

    Mobile() {
        System.out.println("Default Constructor");
    }

    public Mobile(Integer phone, String name, Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    static void SwitchOnAirplaneMode() {
        System.out.println("Common feature");
    }

    void display() {
        System.out.println(this.name + this.phone + this.price);
    }

    void priceChange(Integer price) {
        System.out.println("Change Price in Integers");
    }

    void priceChange(Double price) {
        System.out.println("Change Price in decimals");
    }

    @Override
    void calling() {
        System.out.println("Keypad to touchscreen");
    }
}

class oldPhone implements SIMCard {
    void calling() {
        System.out.println("Keypad");
    }

    @Override
    public void enterCard() {
        System.out.println("Card entered");
    }
}

interface SIMCard {
    void enterCard();
}