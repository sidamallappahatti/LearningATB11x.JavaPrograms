package ex_16_Arrays;

public class Lab141_Arrays_Max_Min {
    public static void main(String[] args) {
        int[] marks = {90, 88, 85, 87, 96, 97, 99, 80};

        int highest_marks = max_marks(marks);
        int lowest_marks = min_marks(marks);
        System.out.println(highest_marks);
        System.out.println(lowest_marks);

    }

    private static int min_marks(int[] marks) {
        int min = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        return min;

    }

    private static int max_marks(int[] marks) {


        int max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        return max;
    }
}