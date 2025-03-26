package ex_12_String;

public class Lab074_StringFunctions {
    public static void main(String[] args) {

        String name="Seyon";
        System.out.println(name.length());
        System.out.println(name.charAt(2));

        //substring(int start, int end)
        String str = "Automation";
        System.out.println("Substring: " + str.substring(0, 4));

        String str1 = "Selenium Testing";
        System.out.println(str1.contains("Test"));

        //concat
        System.out.println(name.concat("Karthikeyan"));

        //equalsIgnorecase
        System.out.println(name.equalsIgnoreCase("seyon"));

        //equals
        System.out.println(name.equals("seyon"));

        //contains
        System.out.println(name.contains("on"));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        //trim
        String s1= "  Java Programming  ";
        System.out.println(s1.trim());

        //split
        String email="seyon14@gmail.com";
        String[] result = email.split("@");
        System.out.println(result[0]);
        System.out.println(result[1]);

        //indexof
        System.out.println(name.indexOf('o'));

        //  startsWith()
        System.out.println(name.startsWith("S"));

        // 15. endsWith()
        System.out.println(name.endsWith("a"));

        //  compareTo()
        System.out.println(name.compareTo("Seyon"));

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);
    }
}
