package dayWise_Tasks.JavaCoding;

import java.util.Scanner;

public class Q4_Check_VowelsOrConst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            System.out.println("The given character " + ch + " is a vowel");
        }else
            System.out.println("The given character " + ch + "is a consonant");
    }
}
