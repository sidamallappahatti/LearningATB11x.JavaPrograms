package Tasks;

public class Task012_StringBuffer_StringBuilder_Functions {
    public static void main(String[] args) {

        // Creating StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        //append(String s): Adds text at the end
        sb.append(" World");
        System.out.println(sb);

        //insert(int index, String s): Inserts text at a given position
        sb.insert(5, "..");
        System.out.println(sb);

        //replace(int start, int end, String s): Replaces a substring
        sb.replace(5, 7, "!");
        System.out.println(sb);

        //delete(int start, int end): Deletes a substring
        sb.delete(6, 12);
        System.out.println(sb);

        //reverse(): Reverses the string
        sb.reverse();
        System.out.println(sb);

        //charAt(int index): Returns a character at a specified index

        System.out.println(sb.charAt(5));


        //setCharAt(int index, char ch): Changes a character at a position
        sb.setCharAt(0, '@');
        System.out.println(sb);

        //length(): Returns the length of the buffer
        System.out.println(sb.length());

        //substring(int start): Extracts a substring
        StringBuffer sb1 = new StringBuffer("Automation");
        System.out.println(sb1.substring(0, 4));

        //toString(): Converts StringBuffer to String
        StringBuffer sb2 = new StringBuffer("Hello");
        String str = sb2.toString();
        System.out.println(str);

        //trimToSize(): Reduces capacity to fit the current content
        StringBuffer sb3 = new StringBuffer(50);
        sb3.append("Hello");
        System.out.println(sb3.capacity());
        sb3.trimToSize();
        System.out.println(sb3.capacity());
    }
}
