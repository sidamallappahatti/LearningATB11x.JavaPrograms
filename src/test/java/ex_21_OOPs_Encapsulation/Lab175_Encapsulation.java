package ex_21_OOPs_Encapsulation;

public class Lab175_Encapsulation {

    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);

        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);


        GoodVWOLogin goodVWOLogin = new GoodVWOLogin("admin","pwd123");
//        System.out.println(goodVWOLogin.password);
//        System.out.println(goodVWOLogin.username);

        goodVWOLogin.setUsername("Siddu");
        System.out.println(goodVWOLogin.getUsername());
        System.out.println(goodVWOLogin.getPassword());

        goodVWOLogin.setPassword("Pass1122", false);
        System.out.println(goodVWOLogin.getPassword());

        goodVWOLogin.setPassword("Pass1122", true);
        System.out.println(goodVWOLogin.getPassword());
    }
}

class VWOLogin {
    public String username;
    public String password;

    VWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }
}

class GoodVWOLogin {
    private String username;  //Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    private String password;

    public GoodVWOLogin(String usr, String pwd) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("You're not allowed to set password!");
        }
    }
}
