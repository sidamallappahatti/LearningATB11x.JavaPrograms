package ex_22_OOPs_accessModifiers.Police;

public class Cop {
    private int gun;
    String iCard;

    public Cop(int bullet) {
        this.gun = bullet;
    }

     protected void canIShoot() {
        System.out.println("Yes! you can shoot");
    }
}
