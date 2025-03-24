package Tasks;

import java.util.Scanner;

public class Task011_VowelAndConsonants_Counter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");

        String Originalstring = scanner.nextLine();
        String str = Originalstring.toLowerCase();

        int vowels = 0;
        int cons = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    cons++;
                }
            }
        }
        scanner.close();

        System.out.println("Number of vowels in " + Originalstring + ": " + vowels);
        System.out.println("Number of consonants in " + Originalstring + ": " + cons);
    }
}
