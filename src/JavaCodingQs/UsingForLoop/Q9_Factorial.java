package JavaCodingQs.UsingForLoop;

import java.util.Scanner;

public class Q9_Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the input:");
        int n= sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of a number " + n +" is " + fact);
    }
}
