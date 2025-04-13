package dayWise_Tasks.JavaCoding;

import java.util.Scanner;

public class Q3_MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int result=(a>b)?a:b;
        System.out.println("Maximum number is: " + result);

    }
}
