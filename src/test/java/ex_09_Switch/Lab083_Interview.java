package ex_09_Switch;

public class Lab083_Interview {
    public static void main(String[] args) {
        long a1 = 30l;
        switch ((int) a1) {

        }
    }
}
//long is not directly allowed in a switch statement in Java.
//This compiles and runs fine because (int) a1 converts the long value to an int, which is valid in switch.
