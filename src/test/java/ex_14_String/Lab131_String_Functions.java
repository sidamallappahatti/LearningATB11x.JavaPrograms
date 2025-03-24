package ex_14_String;

public class Lab131_String_Functions {

    public static void main(String[] args) {

        String name = "Automation";
        System.out.println(name.length());
        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(10)); //StringIndexOutOfBoundsException

        // concat()
        System.out.println(name.concat(" Tester"));

        // contains()
        System.out.println(name.contains("Auto"));

        // equals()
        System.out.println(name.equals("Automation"));

        //equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("auTOMaTion"));

        //indexOf()
        System.out.println(name.indexOf("i"));

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));

        // replace()
        System.out.println(name.replace("Automation","Selenium"));

       // split()
        String name1 = "siddu@live.com@123";
        String[] split=name1.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //substring( , )
        System.out.println(name.substring(4,10));

        //toLowerCase()
        System.out.println(name.toLowerCase());

        //toUpperCase()
        System.out.println(name1.toUpperCase());

        //startsWith()
        System.out.println(name.startsWith("A"));

        //endsWith()
        System.out.println(name.endsWith("n"));

        //trim()
        String str="    Siddu  ";
        System.out.println(str.trim());

        //compareTo()
        System.out.println(name.compareTo("Automation"));


        StringBuilder stringBuilder=new StringBuilder("String Builder");
        System.out.println(stringBuilder);

        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb.toString());

        String anotherPalindrome = "Niagara. O roar again!";
        String ss = anotherPalindrome.substring(11, 15);
        System.out.println(ss);

        String s11="I";
        String s22="Will";
        String s33="Do It";

        String concat=s11+s22+s33;
        System.out.println(concat);



    }
}
