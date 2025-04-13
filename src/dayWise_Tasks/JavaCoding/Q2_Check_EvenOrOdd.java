package dayWise_Tasks.JavaCoding;

import java.util.Scanner;

public class Q2_Check_EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the input:");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println(num + " is a even a number.");
        }else
            System.out.println(num + " is a odd number.");
    }
}
