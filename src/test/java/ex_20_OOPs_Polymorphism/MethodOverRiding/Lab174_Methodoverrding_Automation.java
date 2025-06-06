package ex_20_OOPs_Polymorphism.MethodOverRiding;

public class Lab174_Methodoverrding_Automation {
    public static void main(String[] args) {
        ChromeTC c=new ChromeTC();
        c.openBrowser();

        Firefox f=new Firefox();
        f.openBrowser();

        commomnToAll ca=new commomnToAll();
        ca.openBrowser();

        // Dynamic Dispatch
        commomnToAll ca1=new ChromeTC();
        ca1.openBrowser();

        commomnToAll ca2 = new Firefox();
        ca2.openBrowser();

        // Firefox ff = new ChromeTC(); Not relation
    }
}

class commomnToAll{

    void openBrowser(){
        System.out.println("Open the IE Browser!");
    }

}

class ChromeTC extends commomnToAll{
    @Override
    void openBrowser(){
        System.out.println("Chrome will open now");
    }

    int openBrowser(int a){
        return 10;
    }
}

class Firefox extends commomnToAll{

    @Override
    void openBrowser(){
        System.out.println("Firefox will start!");
    }
}
