package dayWise_Tasks;

import java.util.Scanner;

public class Lab12_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.next();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            rev = rev + ch;
        }
        if(str.equals(rev)) {
            System.out.println("Palindrome");

        }else
            System.out.println("Not a Palindrome");
    }
    }





