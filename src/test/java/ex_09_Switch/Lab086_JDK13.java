package ex_09_Switch;

public class Lab086_JDK13 {
    public static void main(String[] args) {
        // JDK > 13

        int itemcode = 007;

        switch (itemcode){
            case 001,002,005:
                System.out.println("This itemcode belongs to mobile category");
                break;
            case 004,006,007:
                System.out.println("This itemcode belongs to laptop category");
                break;
            default:
                System.out.println("Invalid itemcode");
        }
    }
}
