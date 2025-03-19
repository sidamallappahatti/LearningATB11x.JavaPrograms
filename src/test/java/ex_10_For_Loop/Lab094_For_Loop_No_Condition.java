package ex_10_For_Loop;

public class Lab094_For_Loop_No_Condition {
    public static void main(String[] args) {

        for(int i=0; ; i++){
            System.out.println(i);
        }
    }
}

// No condition is provided → This means the loop runs forever (infinite loop).
//It keeps printing numbers forever (until manually stopped).

// exit code 130 (Stop by Yourself- Kill) Red Button - interrupted by signal
// exit code 0 - Successful